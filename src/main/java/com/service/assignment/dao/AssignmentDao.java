package com.service.assignment.dao;

import org.springframework.stereotype.Component;
import com.service.assignment.model.AssignmentResponse;


@Component
public class AssignmentDao {
	
	public AssignmentResponse getAssignments() {
		return new AssignmentResponse();
	}
	

}
