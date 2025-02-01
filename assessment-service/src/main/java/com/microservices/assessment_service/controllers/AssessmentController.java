package com.microservices.assessment_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.assessment_service.model.Dao.Services.IAssessment;

@RestController
@RequestMapping("/api/assessment")
public class AssessmentController {

	@Autowired
	IAssessment assessmentService;
	
	@GetMapping("/")
	public String getAssessments() {
		return "your assessment starts here";
	}
}
