package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Study7Test {
	@Test
	@DisplayName("테스트 반복하기")
//	@RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")					// 10번 반복
	void new_test() {
	}
	
	@DisplayName("파라메터 다르게 받아 테스트")
	@ParameterizedTest(name = "{index} {displayName} message={0}")
//	@ValueSource(strings = {"새우", "키우고", "싶어"})
	@ValueSource(ints = {10,20,40})
//	@CsvSource({"java, 10"})
	void parameterTest(Integer limit) {
		System.out.println(limit);
	}
}
