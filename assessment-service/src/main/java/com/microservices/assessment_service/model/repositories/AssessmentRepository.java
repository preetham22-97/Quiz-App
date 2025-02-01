package com.microservices.assessment_service.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.assessment_service.model.Pojo.AssessmentSchedule;

public interface AssessmentRepository extends JpaRepository<AssessmentSchedule, Long> {

}
