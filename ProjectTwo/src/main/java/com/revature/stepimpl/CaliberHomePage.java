package com.revature.stepimpl;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.driver.DriverFactory;
import com.revature.pom.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliberHomePage {

	WebDriver driver;
	WebDriverWait wait;
	HomePage home;
	
	@Given("^a user opens a web browser$")
	public void a_user_opens_a_web_browser() throws Throwable {
		driver = DriverFactory.getDriver("chrome");
		driver.manage().window().maximize();
		
		// Need to wait for homepage to load; could be written better!
		// not supposed to have a timer or timeout, but this functions for now 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	@Given("^navigates to the Caliber website$")
	public void navigates_to_the_Caliber_website() throws Throwable {
		home = new HomePage(driver);
		assertEquals("Caliber | Performance Management", home.getPageTitle());
	}
	
	@Then("^the user should see the home page$")
	public void the_user_should_see_the_home_page() throws Throwable {
		// The below will qualify for any given page! This is not what we want! 
		// ***** NEED MORE ROBUST TEST HERE *****
		assertEquals("Caliber | Performance Management", home.getPageTitle());
	}
	
	@Then("^the user clicks on the Revature logo$")
	public void the_user_clicks_on_the_Revature_logo() throws Throwable {
		home.getLogoButton();
		Thread.sleep(1000);
	}

	@Then("^the user clicks on the home button$")
	public void the_user_clicks_on_the_home_button() throws Throwable {
		home.getHomeButton();
		Thread.sleep(1000);
	}

	@Then("^the user clicks on manage batch and back home$")
	public void the_user_clicks_on_manage_batch_and_back_home() throws Throwable {		
		home.getManageBatchButton();
		Thread.sleep(1000);
		driver.navigate().back();
		// assert home
	}

	@Then("^the user clicks on assess batch and back home$")
	public void the_user_clicks_on_assess_batch_and_back_home() throws Throwable {
		home.getAssessBatchButton();
		Thread.sleep(1000);
		driver.navigate().back();
	}

	@Then("^the user clicks on reports and back home$")
	public void the_user_clicks_on_reports_and_back_home() throws Throwable {
		home.getReportsButton();
		Thread.sleep(1000);
		driver.navigate().back();
	}

	@Then("^the user clicks on user guide and back home$")
	public void the_user_clicks_on_user_guide_and_back_home() throws Throwable {
		home.getUserGuide();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	@Then("^the user clicks on the phone number$")
	public void the_user_clicks_on_the_phone_number() throws Throwable {
		home.getPhoneNumber();
		Thread.sleep(1000);
	}

	@Then("^the user clicks on the email$")
	public void the_user_clicks_on_the_email() throws Throwable {
		home.getEmail();
		Thread.sleep(1000);
	}

	@Then("^the user clicks on the Revature link and returns back home$")
	public void the_user_clicks_on_the_Revature_link_and_returns_back_home() throws Throwable {
		String winHandleBefore = driver.getWindowHandle();
		home.getRevatureLink();
		Thread.sleep(2000);
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
	}
	
	@Then("^the user clicks on the benchmark on the HTML(\\d+) Canvas element$")
	public void the_user_clicks_on_the_benchmark_on_the_HTML_Canvas_element(int arg1) throws Throwable {
		Actions builder = new Actions(driver);
//		for(int i = 0; i < 646; i++) {
//			for(int j = 0; j < 30; j++) {
//				builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),i,j).click().build().perform();
//				System.out.println("i = " + i + ", j = " + j);
//				Thread.sleep(10);
//			}
//		}
		System.out.println("Clicking on first bar graph");
		Thread.sleep(1000);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),200,125).click().build().perform();
		Thread.sleep(1000);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),200,125).click().build().perform();
		
		System.out.println("Clicking on second bar graph");
		Thread.sleep(1000);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),200,400).click().build().perform();
		Thread.sleep(1000);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),200,400).click().build().perform();
		
		System.out.println("Clicking on Benchmarks");
		Thread.sleep(1000);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),210,15).click().build().perform();
		Thread.sleep(1000);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),210,15).click().build().perform();
		
		System.out.println("Clicking on Batch Scores");
		Thread.sleep(1000);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),321,15).click().build().perform();
		Thread.sleep(1000);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),321,15).click().build().perform();
		
		Thread.sleep(2000);
	}
	
	@After  
	public void shutdowndriver() {
		driver.quit();
	}
	
}
