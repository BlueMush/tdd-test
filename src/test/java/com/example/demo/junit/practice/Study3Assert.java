package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Study3Assert {
	@Test
	void create() {
		Study1 study = new Study1();
		assertAll(
			()-> assertNotNull(study),
			()->assertEquals(StudyStatus.DRAFT, study.getStatus(), ()->"스터디 처음 만들면 상태값이 " + StudyStatus.DRAFT),
			()->assertTrue(study.getLimit() > 0, ()-> " 최대인원은 0보다 커야된다")
		);
//		assertNotNull(study);
//		assertEquals(StudyStatus.DRAFT, study.getStatus(), ()->"스터디 처음 만들면 상태값이 " + StudyStatus.DRAFT);
//		assertTrue(study.getLimit() > 0, ()-> " 최대인원은 0보다 커야된다");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("before all");
	}
	
	
	@AfterAll
	static void afterAll() {
		System.out.println("after all");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before each");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("after each");
	}
}
