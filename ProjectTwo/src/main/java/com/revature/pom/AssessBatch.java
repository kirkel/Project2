package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssessBatch extends HomePage {

	public AssessBatch(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getYearDropdown( ) {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[1]/a"));
	}
	
	public WebElement getYearInDropdown(int year) {
		if(year < 2016  || year > 2019) {
			throw new IllegalArgumentException("The year must be between 2016 and 2019");
		}
		year -= 2016;
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[1]/ul/li[" + year + "]/a"));
	}
	
	public WebElement getOwnerDropdown() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]/a"));
	}
	
	public WebElement getOwnerDropdownSelection() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]/ul/li/a"));
	}
	
	public WebElement getCreateAssessment() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[3]/a"));
	}
	
	public void getWeekAssessment(int week) {
		

		
	}
	

}
