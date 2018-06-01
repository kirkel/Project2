package com.revature.hibernate.enums;

import java.util.Random;

public enum AssessmentType {

	EXAM("Exam"),
	VERBAL("Verbal"),
	PROJECT("Project"),
	PRESENTATION("Presentation"),
	OTHER("Other");
	
	private String name;

	AssessmentType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }  
    
	private static final AssessmentType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static AssessmentType getRandom()  {
      return VALUES[RANDOM.nextInt(SIZE)];
    }
}
