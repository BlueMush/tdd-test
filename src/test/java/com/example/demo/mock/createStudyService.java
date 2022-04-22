package com.example.demo.mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.mock.member.MemberService;
import com.example.demo.mock.study.StudyRepository;
import com.example.demo.mock.study.StudyService;


@ExtendWith(MockitoExtension.class)
public class createStudyService {
	@Test
	void createStudyService(@Mock MemberService memberServiceMock, 
							@Mock StudyRepository studyRepoMock) {
		// 메소드로 만드는 방법
//		MemberService memberServiceMock = Mockito.mock(MemberService.class);
//		StudyRepository studyRepoMock = Mockito.mock(StudyRepository.class);
		
		StudyService studyService = new StudyService(memberServiceMock, studyRepoMock);
		
		assertNotNull(studyService);
	}
}
