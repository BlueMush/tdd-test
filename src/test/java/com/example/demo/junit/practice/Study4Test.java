package com.example.demo.junit.practice;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class Study4Test {
	@Test
	@DisplayName("���ǿ� ���� �׽�Ʈ �����ϱ�")
	@EnabledOnOs({OS.WINDOWS, OS.LINUX})		// os�� ������ų� ���������
	@EnabledOnJre(JRE.JAVA_17)					// �ڹ� ������ 17�̶��
	void new_test1() {
		String test_env = System.getenv("TEST_ENV");
		System.out.println(test_env);
		assumeTrue("LOCAL".equalsIgnoreCase(test_env));
	}
	
	@Test
	@DisplayName("���� ���İ� �ٸ� ���� ���� ���")
	@EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "null")
	void new_test2() {
		System.out.println("�ȶ�");
	}
}
