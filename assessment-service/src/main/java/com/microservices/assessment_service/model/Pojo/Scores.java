package com.microservices.assessment_service.model.Pojo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserScores")
public class Scores {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private AssessmentSchedule assessmentId;
	private String optionSelected;
	private String rightAnswers;
	private double results;
	public Scores() {
		super();
	}
	public AssessmentSchedule getAssessmentId() {
		return assessmentId;
	}
	public String getOptionSelected() {
		return optionSelected;
	}
	public void setOptionSelected(String optionSelected) {
		this.optionSelected = optionSelected;
	}
	public String getRightAnswers() {
		return rightAnswers;
	}
	public void setRightAnswers(String rightAnswers) {
		this.rightAnswers = rightAnswers;
	}
	public double getResults() {
		return results;
	}
	public void setResults(double results) {
		this.results = results;
	}
	public Long getId() {
		return id;
	}
	public void setAssessmentId(AssessmentSchedule assessmentId) {
		this.assessmentId = assessmentId;
	}
	public Scores(AssessmentSchedule assessmentId, String optionSelected, String rightAnswers,
			double results) {
		super();
		this.assessmentId = assessmentId;
		this.optionSelected = optionSelected;
		this.rightAnswers = rightAnswers;
		this.results = results;
	}
}
