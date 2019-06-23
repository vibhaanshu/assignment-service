package com.service.assignment.model;

public class AssignmentResponse {
	
	Object[][] assignList = { {"Date", "Assignment","Submission", "Average"}, {"1",10,0,0},
			{"2",10,0,0},{"3",10,0,0},{"4",10,0,0}};

	public Object[][] getAssignList() {
		return assignList;
	}

	public void setAssignList(Object[][] data) {
		this.assignList = data;
	}

	
}
