package com.service.assignment.model;

public class AssignmentResponse {
	
	String[][] data = { {"Date", "Assignment","Submission", "Average"}, {"1","10.0","0"},
			{"1","10.0","0"},{"1","10.0","0"},{"1","10.0","0"}};

	public String[][] getData() {
		return data;
	}

	public void setData(String[][] data) {
		this.data = data;
	}

	
}
