package com.revature.hibernate.services;

import java.util.List;

import com.revature.hibernate.dao.AssessmentDao;
import com.revature.hibernate.dao.AssessmentDaoImpl;
import com.revature.hibernate.entity.Assessment;

public class AssessmentService {

	
	private static AssessmentDao dao = AssessmentDaoImpl.getInstance();
	private AssessmentService() {}
	
	public static List<Assessment> getAllAssessments() {
		return dao.getAllAssessments();
	}
	
	public static boolean insertAssessment(Assessment assessment)  {
		return dao.insertAssessment(assessment);
	}
	
	public static boolean updateAssessment(Assessment assessment) {
		return dao.updateAssessment(assessment);
	}
	
	public static boolean deleteAssessment(Assessment assessment) {
		return dao.deleteAssessment(assessment);
	}

}
