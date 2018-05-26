//package com.revature.tests;
//
//import static org.testng.Assert.assertEquals;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import com.revature.driver.DriverFactory;
//import com.revature.pom.HomePage;
//
//public class CaliberTest {
//
//	WebDriver driver;
//	WebDriverWait wait;
//	HomePage home;
//	
//	@BeforeSuite
//	public void beforeSuite() {
//		driver = DriverFactory.getDriver("Chrome");
//		
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		
//		wait = new WebDriverWait(driver, 1);
//	}
//	
//	@Test(priority=1)
//	public void navigateToCaliber() {
//		home = new HomePage(driver);
//	}
//
//	@Test(priority=2)
//	public void validateSuccessfulNavigationToCaliber() {
//		assertEquals("Caliber | Performance Management", home.getPageTitle());
//	}
//	
//	
//	
//	
//	
//	@AfterSuite
//	public void afterSuite() {
//		driver.quit();
//	}
//
//}
