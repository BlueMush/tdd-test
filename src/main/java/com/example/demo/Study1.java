package com.example.demo;

public class Study1 {
	
	private StudyStatus status = StudyStatus.DRAFT;
	

	public StudyStatus getStatus() {
		return this.status;
	}
	
	void create() {
		Study1 study = new Study1();
	}
}
