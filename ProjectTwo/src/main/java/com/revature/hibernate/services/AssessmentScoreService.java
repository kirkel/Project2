package com.revature.hibernate.services;

import java.util.List;

import com.revature.hibernate.dao.AssessmentScoreDao;
import com.revature.hibernate.dao.AssessmentScoreDaoImpl;
import com.revature.hibernate.entity.AssessmentScore;

public class AssessmentScoreService {

	private static AssessmentScoreDao dao = AssessmentScoreDaoImpl.getInstance();
	private AssessmentScoreService() {}
	
	public static List<AssessmentScore> getAllAssessmentScores() {
		return dao.getAllAssessmentScores();
	}
	
	public static boolean insertAssessmentScore(AssessmentScore assessmentScore)  {
		return dao.insertAssessmentScore(assessmentScore);
	}
	
	public static boolean updateAssessmentScore(AssessmentScore assessmentScore) {
		return dao.updateAssessmentScore(assessmentScore);
	}
	
	public static boolean deleteAssessmentScore(AssessmentScore assessmentScore) {
		return dao.deleteAssessmentScore(assessmentScore);
	}
}
