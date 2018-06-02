package com.revature.hibernate.enums;

import java.util.Random;

public enum TrainingStatus {
	
	SINGED("Signed"),
	SELECTED("Selected"),
	TRAINING("Training"),
	MARKETING("Marketing"),
	CONFIMRED("Confirmed"),
	EMPLOYED("Employed"),
	DROPPED("Dropped");
	
	private String name;

	TrainingStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    } 
    
    private static final TrainingStatus[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static TrainingStatus getRandom()  {
      return VALUES[RANDOM.nextInt(SIZE)];
    }
}
