package com.revature.hibernate.dao;

import java.util.List;

import com.revature.hibernate.entity.AssessmentScore;

public interface AssessmentScoreDao {

	public List<AssessmentScore> getAllAssessmentScores();
	public boolean insertAssessmentScore(AssessmentScore assessmentScore);
	public boolean updateAssessmentScore(AssessmentScore assessmentScore);
	public boolean deleteAssessmentScore(AssessmentScore assessmentScore);
}
