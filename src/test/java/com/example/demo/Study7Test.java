package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Study7Test {
	@Test
	@DisplayName("�׽�Ʈ �ݺ��ϱ�")
//	@RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")					// 10�� �ݺ�
	void new_test() {
	}
	
	@DisplayName("�Ķ���� �ٸ��� �޾� �׽�Ʈ")
	@ParameterizedTest(name = "{index} {displayName} message={0}")
//	@ValueSource(strings = {"����", "Ű���", "�;�"})
	@ValueSource(ints = {10,20,40})
//	@CsvSource({"java, 10"})
	void parameterTest(Integer limit) {
		System.out.println(limit);
	}
}
