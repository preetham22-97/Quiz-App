package com.microservices.assessment_service.model.Dao.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.assessment_service.model.Dao.Services.IAssessment;
import com.microservices.assessment_service.model.repositories.AssessmentRepository;

@Service
public class AssessmentService implements IAssessment {

	@Autowired
	AssessmentRepository assessmentRepository;
}
