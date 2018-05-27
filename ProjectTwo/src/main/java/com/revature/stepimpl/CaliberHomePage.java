package com.revature.stepimpl;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.revature.pom.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliberHomePage {

	static HomePage home;
	
	@Given("^the user is on the home page for the first time$")
	public void the_user_is_on_the_home_page_for_the_first_time() throws Throwable {
		home = new HomePage(CaliberGeneralGlueCode.driver);
	}

	@Then("^the user clicks on user guide$")
	public void the_user_clicks_on_user_guide() throws Throwable {
		home.getUserGuide();
		Thread.sleep(500);
	}
	
	@Then("^the user should see the github page for Caliber$")
	public void the_user_should_see_the_github_page_for_Caliber() throws Throwable {
		assertEquals("https://github.com/revaturelabs/caliber/wiki#user-guide", CaliberGeneralGlueCode.driver.getCurrentUrl().toString());
	}
	
	@Then("^the user clicks on the HTML(\\d+) Canvas element Cumulative Scores$")
	public void the_user_clicks_on_the_HTML_Canvas_element_Cumulative_Scores(int arg1) throws Throwable {
		Actions builder = new Actions(CaliberGeneralGlueCode.driver);
		
		// The code below will click on every pixel on the entire Cumulative Scores graph 
//		for(int i = 1; i < 646; i++) {
//			for(int j = 1; j < 360; j++) {
//				builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),i,j).click().build().perform();
//				System.out.println("i = " + i + ", j = " + j);
//			}
//		}
		
		// clicks on the first bar graph
		builder.moveToElement(CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"bar6\"]")),200,400).click().build().perform();
		Thread.sleep(500);
		builder.moveToElement(CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"bar6\"]")),200,400).click().build().perform();
		Thread.sleep(500);
		
		// clicks on the second bar graph
//		System.out.println("Clicking on second bar graph");
//		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),200,600).click().build().perform();
//		Thread.sleep(500);
//		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"bar6\"]")),200,600).click().build().perform();
//		Thread.sleep(500);
		
		// clicks on the Benchmark
		builder.moveToElement(CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"bar6\"]")),465,13).click().build().perform();
		Thread.sleep(500);
		builder.moveToElement(CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"bar6\"]")),465,13).click().build().perform();
		Thread.sleep(500);
		
		// clicks on the Batch scores
		builder.moveToElement(CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"bar6\"]")),550,13).click().build().perform();
		Thread.sleep(500);
		builder.moveToElement(CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"bar6\"]")),550,13).click().build().perform();
		Thread.sleep(500);
	}

	@Then("^the user clicks on the HTML(\\d+) Canvas element Technical Skills$")
	public void the_user_clicks_on_the_HTML_Canvas_element_Technical_Skills(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	
}
