package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends POM{

	private static final String URL = "https://dev-caliber.revature.tech/";
	
	public HomePage(WebDriver driver) {
		super(driver);
		driver.get(URL);

	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement usernameField() {
		return driver.findElement(By.name("userName"));
	}
	
	public WebElement passwordField() {
		return driver.findElement(By.name("password"));
	}
	
	public WebElement signInButton() {
		return driver.findElement(By.name("login"));
	}
	
}
