package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends POM{

	private static final String URL = "https://dev-caliber.revature.tech/";
	
	public HomePage(WebDriver driver) {
		super(driver);
		driver.get(URL);
	}
	
	public void getUserGuide() {
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[1]/p/a/img")).click();
	}
		
}
