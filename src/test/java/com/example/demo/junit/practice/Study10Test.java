package com.example.demo.junit.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(FindSlowTestExtension.class)
public class Study10Test {
int value = 1;
	
	@Order(2)
	@CustomFast
	@Test
	@DisplayName("먼저 실행")
	void new_test1() {
		System.out.println("2 = " + value++);
	}
	
	@Order(1)
	@SlowTest
	@DisplayName("이게 더 먼저 실행")
	void new_test2() throws InterruptedException {
		Thread.sleep(1005L);
		System.out.println("1 = " + value++);
	}
}
