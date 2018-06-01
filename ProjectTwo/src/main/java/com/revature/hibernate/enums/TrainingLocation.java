package com.revature.hibernate.enums;

import java.util.Random;

public enum TrainingLocation {

	NY("Tech Incubator at Queens College, 65-30 Kissena Blvd, CEP Hall 2 Queens NY 11367"),
	VA("Revature LLC, 11730 Plaza America Drive, 2nd Floor Reston VA 20190");
	
	
	private String name;

	TrainingLocation(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }    
    
    private static final TrainingLocation[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static TrainingLocation getRandom()  {
      return VALUES[RANDOM.nextInt(SIZE)];
    }
}
