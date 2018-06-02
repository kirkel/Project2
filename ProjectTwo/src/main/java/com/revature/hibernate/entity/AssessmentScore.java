package com.revature.hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="AssessmentScore")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class AssessmentScore{

	@Id
	@GeneratedValue
	@Column(name="AssessmentScore_Id")
	private int AssessmentScore_Id;

	@Column(name="score")
	float score;
	
	@ManyToOne(cascade= {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name="Assessment_Id")
	private Assessment assessment;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="AssessmentScore_Trainee", 
				joinColumns={ @JoinColumn(name="AssessmentScore_Id")},
				inverseJoinColumns={ @JoinColumn(name="Trainee_Id") } )
	List<Trainee> trainees = new ArrayList<>();
	
	public AssessmentScore() {}
	
	

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public List<Trainee> getTrainee() {
		return trainees;
	}

	public void setTrainee(List<Trainee> trainee) {
		this.trainees = trainee;
	}

	public int getAssessmentScore_Id() {
		return AssessmentScore_Id;
	}

	public void setAssessmentScore_Id(int assessmentScore_Id) {
		AssessmentScore_Id = assessmentScore_Id;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AssessmentScore_Id;
		result = prime * result + Float.floatToIntBits(score);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssessmentScore other = (AssessmentScore) obj;
		if (AssessmentScore_Id != other.AssessmentScore_Id)
			return false;
		if (Float.floatToIntBits(score) != Float.floatToIntBits(other.score))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AssessmentScore [score=" + score + "]";
	}
	
}
