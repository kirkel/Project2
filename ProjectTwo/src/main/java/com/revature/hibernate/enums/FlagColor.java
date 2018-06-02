package com.revature.hibernate.enums;

import java.util.Random;

public enum FlagColor {
	OFF,
	RED,
	YELLOW,
	GREEN;
	
	private static final FlagColor[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static FlagColor getRandom()  {
      return VALUES[RANDOM.nextInt(SIZE)];
    }
}
