package com.microservices.assessment_service.model.Pojo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class AssessmentSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long assessmentId;
	private LocalDate assessmentDate;
	private String testLevel;
	private int userId;
	public AssessmentSchedule(LocalDate assessmentDate, String testLevel, int userId) {
		super();
		this.assessmentDate = assessmentDate;
		this.testLevel = testLevel;
		this.userId = userId;
	}
	public AssessmentSchedule() {
		super();
	}
	public Long getAssessmentId() {
		return assessmentId;
	}

	public LocalDate getAssessmentDate() {
		return assessmentDate;
	}
	public void setAssessmentDate(LocalDate assessmentDate) {
		this.assessmentDate = assessmentDate;
	}
	public String gettestLevel() {
		return testLevel;
	}
	public void settestLevel(String testLevel) {
		this.testLevel = testLevel;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
