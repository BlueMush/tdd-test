package com.example.demo.junit.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Study5Tagging {
	@Test
	@DisplayName("�±� ����")
	@Tag("fast")
	void new_test1() {
		System.out.println("fast");
	}
	
	@Test
	@DisplayName("�±� ����")
	@Tag("slow")
	void new_test2() {
		System.out.println("slow");
	}
}
