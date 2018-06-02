package com.revature.hibernate.enums;

import java.util.Random;

public enum TrainingType {

	REVATURE("Revature"),
	CORPORATE("Corporate"),
	UNIVERSITY("University"),
	OTHER("Other");
	
	private String name;
	
	TrainingType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }  
	
	private static final TrainingType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static TrainingType getRandom()  {
      return VALUES[RANDOM.nextInt(SIZE)];
    }
}
