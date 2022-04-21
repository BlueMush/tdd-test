package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.TestInstance;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Study8Instence {
	@CustomFast
	@DisplayName("인스턴스")
	void new_test1() {
		System.out.println(this);
	}
	
	@CustomFast
	@DisplayName("인스턴스")
	void new_test2() {
		System.out.println(this);
	}
	
	@BeforeAll
	void beforeAll() {
		System.out.println("before all");
	}
	
	@AfterAll
	void afterAll() {
		System.out.println("after all");
	}
}
