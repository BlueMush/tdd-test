package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class Study2Test {
	@Test
	void create_tdd_test() {
		Study1 study = new Study1();
		assertNotNull(study);
		System.out.println("create");
	}
	
	@Test
	@DisplayName("TDD Test »ý¼º")
	void createTddTest() {
		System.out.println("create");
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
