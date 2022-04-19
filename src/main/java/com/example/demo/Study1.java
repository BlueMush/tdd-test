package com.example.demo;

import lombok.Getter;

@Getter
public class Study1 {
	
	private StudyStatus status = StudyStatus.DRAFT;
	private int limit = 1;
	

	public StudyStatus getStatus() {
		return this.status;
	}
}
