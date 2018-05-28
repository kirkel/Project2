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

@Entity
@Table(name="AssessmentScore")
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
	List<Trainee> trainee = new ArrayList<>();
	
	public AssessmentScore() {}
	
}
