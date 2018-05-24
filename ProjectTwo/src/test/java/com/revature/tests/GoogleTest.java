package com.revature.tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.revature.driver.DriverFactory;

public class GoogleTest {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.getDriver("Chrome");
		
		// for any element, wait 3 seconds before determining a fail 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// configure our drivers explicit wait as soon as it is instantiated 
		// for a specific action, wait 4 seconds before determining a fail 
		wait = new WebDriverWait(driver, 4);
	}
	
	@Test(priority=1)
	public void navigateToGoogle() {
		driver.get("http://google.com");
	}

	@Test(priority=2)
	public void validateSuccessfulNavigationToGoogle() {
		assertEquals("Google", driver.getTitle());
	}
	
	@Test(priority=3)
	public void automationTesting() {
		driver.findElement(By.id("lst-ib")).sendKeys("cats");
	}
	
	@Test(priority=4)
	public void submitAutomationTestingSearch() {
//		driver.findElement(By.name("btnK")).submit();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).submit();
	}
	
	@Test(priority=5)
	public void validateSuccessfulSearch() {
		assertEquals("cats - Google Search", driver.getTitle());
	}
	
	@Test(priority=6)
	public void clickImages() {
		driver.findElement(By.linkText("Images")).click();
	}
	
	
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
