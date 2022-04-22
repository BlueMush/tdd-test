package com.example.demo.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.mock.domain.Member;
import com.example.demo.mock.domain.Study;
import com.example.demo.mock.member.MemberService;
import com.example.demo.mock.study.StudyRepository;
import com.example.demo.mock.study.StudyService;


@ExtendWith(MockitoExtension.class)
public class createStudyService {
	// �޼ҵ�� ����� ���
//	MemberService memberServiceMock = Mockito.mock(MemberService.class);
//	StudyRepository studyRepoMock = Mockito.mock(StudyRepository.class);
	
	@Mock
	MemberService memberServiceMock;
	
	@Mock
	StudyRepository studyRepoMock;
	
	@Test
	void createStudyService() {
		StudyService studyService = new StudyService(memberServiceMock, studyRepoMock);
		assertNotNull(studyService);
		
		Member member = new Member();
		member.setId(1L);
		member.setEmail("imgusah@gmail.com");;

		when(memberServiceMock.findById(any()))
			.thenReturn(Optional.of(member))
			.thenThrow(new RuntimeException())
			.thenReturn(Optional.empty());

		Study study = new Study(10, "java");
		
		Optional<Member> m1 = memberServiceMock.findById(1L);
		assertEquals("imgusah@gmail.com", m1.get().getEmail());
		assertThrows(RuntimeException.class, () -> {
			memberServiceMock.findById(2L);
		});
		assertEquals(Optional.empty(), memberServiceMock.findById(3L));
		
		studyService.createNewStudy(1L, study);
	}
}