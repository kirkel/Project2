package com.revature.stepimpl;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import com.revature.pom.ManageBatch;

import cucumber.api.java.en.Then;

public class CaliberManageBatch {

	ManageBatch manageBatch;
	
	@Then("^the user should see the manage batch page$")
	public void the_user_should_see_the_manage_batch_page() throws Throwable {
	}
	
	@Then("^the user is on the manage batch page for the first time$")
	public void the_user_is_on_the_manage_batch_page_for_the_first_time() throws Throwable {
		manageBatch = new ManageBatch(CaliberGeneralGlueCode.driver);
		assertEquals("Create Batch", CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]/a")).getText());
	}
	
}
