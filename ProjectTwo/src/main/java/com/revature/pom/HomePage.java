package com.revature.pom;

import org.openqa.selenium.WebDriver;

public class HomePage extends POM{

	private static final String URL = "https://dev-caliber.revature.tech/";
	
	public HomePage(WebDriver driver) {
		super(driver);
		driver.get(URL);
	}
		
}
