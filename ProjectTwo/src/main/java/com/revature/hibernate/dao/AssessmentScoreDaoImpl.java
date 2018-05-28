package com.revature.hibernate.dao;

import java.util.List;

import com.revature.hibernate.entity.AssessmentScore;

public class AssessmentScoreDaoImpl implements AssessmentScoreDao{

	
	private static AssessmentScoreDaoImpl instance;
	private AssessmentScoreDaoImpl() {}
	
	public static AssessmentScoreDaoImpl getInstance() {
		if (instance == null) {
			instance = new AssessmentScoreDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<AssessmentScore> getAllAssessmentScores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertAssessmentScore(AssessmentScore assessmentScore) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAssessmentScore(AssessmentScore assessmentScore) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAssessmentScore(AssessmentScore assessmentScore) {
		// TODO Auto-generated method stub
		return false;
	}

}
