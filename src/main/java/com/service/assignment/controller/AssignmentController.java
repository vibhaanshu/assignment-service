package com.service.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.assignment.model.AssignmentResponse;
import com.service.assignment.service.AssignmentService;

@RestController
public class AssignmentController {
	
	@Autowired
	AssignmentService assignmentService;
	
	@RequestMapping("/assignments")
	public AssignmentResponse getAssignments() {
		return assignmentService.getAssignments();
	}

}
