package com.revature.application;

import com.revature.hibernate.entity.Assessment;
import com.revature.hibernate.enums.AssessmentCategory;
import com.revature.hibernate.enums.AssessmentType;
import com.revature.hibernate.services.AssessmentService;

public class Application {

	public static void main(String[] args) {
		Assessment newass = new Assessment(AssessmentCategory.ANGULARJS, 10, AssessmentType.OTHER);
		System.out.println(AssessmentService.insertAssessment(newass));
	}
}
