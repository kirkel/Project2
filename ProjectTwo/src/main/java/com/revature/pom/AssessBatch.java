package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssessBatch extends HomePage {

	public AssessBatch(WebDriver driver) {
		super(driver);
	}
	
	public void getYearDropdown( ) {
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[1]/a")).click();
	}
	
	public void getYearInDropdown(int year) {
		
		if(year < 2016  || year > 2019) {
			throw new IllegalArgumentException("The year must be between 2016 and 2019");
		}
			
		year -= 2016;
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[1]/ul/li[" + year + "]/a")).click();
	}
	
	public void getOwnerDropdown() {
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]/a")).click();
	}
	
	public void getOwnerDropdownSelection() {
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]/ul/li/a")).click();
	}
	
	public void getCreateAssessment() {
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[3]/a")).click();
	}
	
	public void getWeekAssessment(int week) {
		
//		while(true) {
//			driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[3]/ul/li[" + week + "]/a")).click();
//			week++;
//		}
		
	}
	

}
