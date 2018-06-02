package com.revature.hibernate.enums;

import java.util.Random;

public enum AssessmentCategory {

	JAVA("Java"),
	SQL("SQL"),
	SERVLET("Servlet"),
	JSP("JSP"),
	XML("XML"),
	GIT("Git"),
	JUNIT("JUnit"),
	MAVEN("Maven"),
	JDBC("JDBC"),
	HTML("HTML"),
	CSS("CSS"),
	JAVASCRIPT("JavaScript"),
	JQUERY("JQuery"),
	AJAX("AJAX"),
	UNIX("UNIX"),
	AWS("AWS"),
	JENKINS("Jenkins"),
	HIBERNATE("Hibernate"),
	SPRING("Spring"),
	SOAP("SOAP"),
	REST("REST"),
	ANGULARJS("AngularJS"),
	SELENIUM("Selenium"),
	CUCUMBER("Cucumber"),
	UFT("UFT"),
	PYTHON("Python"),
	ROBOTFRAMEWORK("Robot Framework"),
	ALM("ALM"),
	SDLC("SDLC"),
	AGILE("Agile"),
	TESTING("Testing"),
	VBSCRIPT("VBScript"),
	SOAPUI("SOAP UI"),
	TESTNG("TestNG"),
	CHEF("Chef"),
	DOCKER("Docker"),
	KAFKA("Kafka"),
	MICROSERVICES("Microservices"),
	NOSQL("NoSQL"),
	CSHARP("C#"),
	ASPNET("ASP.NET"),
	ADONET("ADO.NET"),
	ENTITYFRAMEWORK("Entity Framework"),
	MSBUILD("MSBuild"),
	WPF("WPF"),
	WCF("WCF");
	
	private String name;
	
	AssessmentCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }  
	
	private static final AssessmentCategory[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static AssessmentCategory getRandom()  {
      return VALUES[RANDOM.nextInt(SIZE)];
    }
	
}
