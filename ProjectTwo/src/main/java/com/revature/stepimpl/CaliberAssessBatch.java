package com.revature.stepimpl;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.pom.AssessBatch;
import com.revature.pom.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliberAssessBatch {

	WebDriver driver;
	WebDriverWait wait;
	HomePage home;
	AssessBatch assessBatch;
	

	@Given("^clicks on the Assess Batch link$")
	public void clicks_on_the_Assess_Batch_link() throws Throwable {
		if(driver == null) {
			System.out.println("Driver is null");
		}
		assessBatch = new AssessBatch(driver);
		Thread.sleep(2000);
		assessBatch.getAssessBatchButton();
	}

	@Then("^the user should see the Assess Batch page$")
	public void the_user_should_see_the_Assess_Batch_page() throws Throwable {
		assertEquals(driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[3]/a")).getText(), 
				"Create\r\n						Assessment");
	}
	
	@Then("^user returns back to the Assess Batch page$")
	public void user_returns_back_to_the_Assess_Batch_page() throws Throwable {
		Thread.sleep(1000);
		driver.navigate().back();
		assertEquals(driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[3]/a")).getText(), 
				"Create\r\n						Assessment");
	}
	
}
