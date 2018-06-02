package com.revature.hibernate.enums;

import java.util.Random;

public enum SkillType {

	J2EE("J2EE"),
	NET(".NET"),
	SDET("SDET"),
	BPM("BPM"),
	APPIANBPM("Appian BPM"),
	PEGABPM("PEGA BPM"),
	MICROSOFTDYNAMICS365("Microsoft Dynamics 365"),
	JTA("JTA"),
	MICROSERVICES("Microservices"),
	ORACLEFUSION("Oracle Fusion"),
	SALESFORCE("Salesforce"),
	BUSINESSANALYST("Business Analyst"),
	SYSTEMADMIN("System Admin"),
	QA("QA"),
	OTHER("Other");
	
	private String name;
	
	SkillType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    } 
	
	private static final SkillType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static SkillType getRandom()  {
      return VALUES[RANDOM.nextInt(SIZE)];
    }
}
