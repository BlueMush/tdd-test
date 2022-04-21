package com.example.demo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Study1 {
	
	private StudyStatus status = StudyStatus.DRAFT;
	private int limit = 1;
	private String name;
	
	public Study1() {
		
	}
	
	
	public Study1(int limit, String name) {
		this.limit = limit;
		this.name = name;
	}

	public StudyStatus getStatus() {
		return this.status;
	}
}
