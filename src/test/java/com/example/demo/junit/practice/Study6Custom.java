package com.example.demo.junit.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Study6Custom {
	@Test
	@DisplayName("커스텀 태그 만들기")
	@CustomFast
	void new_test() {
		System.out.println("커스텀 태그 테스트");
	}
}
