package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Study9Test {
	@Order(2)
	@CustomFast
	@Test
	@DisplayName("먼저 실행")
	void new_test1() {
		System.out.println("1");
	}
	
	@Order(1)
	@Test
	@DisplayName("이게 더 먼저 실행")
	void new_test2() {
		System.out.println("2");
	}
}
