package com.revature.hibernate.enums;

import java.util.Random;

public enum Trainer {

	NUMBERS("123"),
	NAME("Name"),
	BFS("bfs"),
	PATRICK("Patrick Walsh"),
	DAN("Dan Pickles"),
	KARAN("Karan Dhirar"),
	BRIAN("Brian Connolly"),
	GENESIS("Genesis Bonds"),
	ANKIT("Ankit Garg"),
	RYAN("Ryan Lessley"),
	STEVEN("Steven Kelsey"),
	EMILY("Emily Higgins"),
	TAYLOR("Taylor Kemper"),
	RICHARD("Richard Orr"),
	NICK("Nickolas Jurczak"),
	AUGUST("August Duet"),
	YUVARAJ("Yuvaraj Damodaran"),
	FRED("Fred Belotte"),
	MEHRAB("Mehrab Rahman"),
	PETER("Peter Alagna"),
	STANELY("Stanley Medikonda"),
	GRAY("Gray Wynne"),
	ORSON("Orson Wallace"),
	SHELBY("Shelby Levinson"),
	WALTER("Walter Payne"),
	NATALIE("Natalie Church"),
	ARCHER("Archer Radcliff"),
	RAJESH("Rajesh Yamunachari"),
	RAGHAVAN("Raghavan Swaminathan"),
	MARVIN("Marvin"),
	SPONGEBOB("Spongebob Squarepants"),
	KERMIT("Kermit Frog"),
	REGEX("!@#$%^&*()");
	
	
	private String name;

	Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    } 
    
    private static final Trainer[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static Trainer getRandom()  {
      return VALUES[RANDOM.nextInt(SIZE)];
    }
}
