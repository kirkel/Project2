package com.revature.hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.revature.hibernate.enums.AssessmentCategory;
import com.revature.hibernate.enums.AssessmentType;

@Entity
@Table(name="Assessment")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Assessment{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "A_gen")
	@SequenceGenerator(name="A_gen", sequenceName = "A_seq", allocationSize=1)
	@Column(name="Assessment_Id")
	private int Assessment_Id;
	
	@Column(name="category")
	AssessmentCategory category;
	
	@Column(name="maxPoints")
	int maxPoints;
	
	@Column(name="type")
	AssessmentType type;
	
	@ManyToOne(cascade= {CascadeType.REMOVE, CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name="Week_Id")
	private Week week;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="assessment")
	private List<AssessmentScore> assessmentScores = new ArrayList<>();
	
	public Assessment() {}
	
	public Assessment(AssessmentCategory category, int maxPoints, AssessmentType type, Week week) {
		super();
		this.category = category;
		this.maxPoints = maxPoints;
		this.type = type;
		this.week = week;
	}

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}

	public List<AssessmentScore> getAssessmentScores() {
		return assessmentScores;
	}

	public void setAssessmentScores(List<AssessmentScore> assessmentScores) {
		this.assessmentScores = assessmentScores;
	}

	public int getAssessment_Id() {
		return Assessment_Id;
	}

	public void setAssessment_Id(int assessment_Id) {
		Assessment_Id = assessment_Id;
	}

	public AssessmentCategory getCategory() {
		return category;
	}
	public void setCategory(AssessmentCategory category) {
		this.category = category;
	}
	public int getMaxPoints() {
		return maxPoints;
	}
	public void setMaxPoints(int maxPoints) {
		this.maxPoints = maxPoints;
	}
	public AssessmentType getType() {
		return type;
	}
	public void setType(AssessmentType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + maxPoints;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Assessment other = (Assessment) obj;
		if (category != other.category)
			return false;
		if (maxPoints != other.maxPoints)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Assessment [category=" + category + ", maxPoints=" + maxPoints + ", type=" + type + "]";
	}
	
	
	
}
