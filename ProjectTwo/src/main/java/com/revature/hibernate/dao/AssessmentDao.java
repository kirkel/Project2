package com.revature.hibernate.dao;

import java.util.List;
import com.revature.hibernate.entity.Assessment;

public interface AssessmentDao {

	public List<Assessment> getAllAssessments();
	public boolean insertAssessment(Assessment assessment);
	public boolean updateAssessment(Assessment assessment);
	public boolean deleteAssessment(Assessment assessment);
}
