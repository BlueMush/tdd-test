package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Study3Assert {
	@Test
	void create() {
		Study1 study = new Study1();
		assertNotNull(study);
		assertEquals(StudyStatus.DRAFT, study.getStatus(), ()->"스터디 처음 만들면 상태값이 " + StudyStatus.DRAFT);
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
