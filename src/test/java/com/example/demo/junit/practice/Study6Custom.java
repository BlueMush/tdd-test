package com.example.demo.junit.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Study6Custom {
	@Test
	@DisplayName("Ŀ���� �±� �����")
	@CustomFast
	void new_test() {
		System.out.println("Ŀ���� �±� �׽�Ʈ");
	}
}
