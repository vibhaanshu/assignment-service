package com.service.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.assignment.dao.AssignmentDao;
import com.service.assignment.model.AssignmentResponse;

@Component
public class AssignmentService {

	@Autowired
	AssignmentDao assignmentDao;
	
	public AssignmentResponse getAssignments() {
		return assignmentDao.getAssignments();
	}
}
