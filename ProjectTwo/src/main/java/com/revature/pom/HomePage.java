package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends POM{

	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getUserGuide() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[1]/p/a"));
	}
	
	public WebElement getWelcomeHome() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/h1"));
	}
		
}
