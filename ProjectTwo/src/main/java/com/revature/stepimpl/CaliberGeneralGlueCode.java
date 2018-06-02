package com.revature.stepimpl;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.driver.DriverFactory;
import com.revature.hibernate.entity.Batch;
import com.revature.hibernate.entity.Trainee;
import com.revature.hibernate.services.BatchService;
import com.revature.hibernate.services.TraineeService;
import com.revature.pom.POM;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliberGeneralGlueCode {

	static WebDriver driver;
	POM pom;
	String caliberUrl = "https://dev-caliber.revature.tech/caliber/#/trainer/";
	
	
	@After  
	public void shutdowndriver() {
		driver.quit();
	}
	
	@Given("^a user opens a web browser to visit the Caliber website$")
	public void a_user_opens_a_web_browser_to_visit_the_Caliber_website() throws Throwable {
		driver = DriverFactory.getDriver("chrome");
		driver.manage().window().maximize();
		
		// Initializes the driver to go to the Caliber website
		pom = new POM (driver, true);

		System.out.println("Check to ensure the page is loaded");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[1]/a")));
		System.out.println("The page has been loaded");
		
		//This should be present on every page, and thus should always be true 
		assertEquals("Caliber | Performance Management", pom.getPageTitle());
	}
	
	@Then("^the user returns back to the previous page$")
	public void the_user_returns_back_to_the_previous_page() throws Throwable {
		driver.navigate().back();
	}
	
	@Then("^the user should see the home page$")
	public void the_user_should_see_the_home_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Checks for the presence of the home tag
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div/ui-view/ui-view/div[1]/h1")));
		assertEquals(caliberUrl.concat("home"), driver.getCurrentUrl().toString());
	}
	
	@Then("^the user clicks on the Revature logo$")
	public void the_user_clicks_on_the_Revature_logo() throws Throwable {
		pom.getLogoButton().click();
	}

	@Then("^the user clicks on the home button$")
	public void the_user_clicks_on_the_home_button() throws Throwable {
		pom.getNavbarElements("home").click();
	}
	
	@Then("^the user clicks on manage batch$")
	public void the_user_clicks_on_manage_batch() throws Throwable {
		pom.getNavbarElements("manageBatch").click();
	}
	
	@Then("^the user should see the manage batch page$")
	public void the_user_should_see_the_manage_batch_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("manage")));
		assertEquals(caliberUrl.concat("manage"), CaliberGeneralGlueCode.driver.getCurrentUrl().toString());
	}
	
	@Then("^the user clicks on assess batch$")
	public void the_user_clicks_on_assess_batch() throws Throwable {
		pom.getNavbarElements("assessBatch").click();
	}
	
	@Then("^the user should see the assess batch page$")
	public void the_user_should_see_the_assess_batch_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("trainer-assess-table")));
		assertEquals(caliberUrl.concat("assess"), driver.getCurrentUrl().toString());
	}

	@Then("^the user clicks on reports$")
	public void the_user_clicks_on_reports() throws Throwable {
		pom.getNavbarElements("reports").click();

	}

	@Then("^the user should see the reports page$")
	public void the_user_should_see_the_reports_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("caliber-container")));
		assertEquals(caliberUrl.concat("reports"), driver.getCurrentUrl().toString());
	}

	@Then("^the user clicks on the Revature link and returns to the previous page$")
	public void the_user_clicks_on_the_Revature_link_and_returns_to_the_previous_page() throws Throwable {
		pom.getFooterLink("revature").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> windows = driver.getWindowHandles();
		Object[] windowsarray = windows.toArray();
		
		driver.switchTo().window((String) windowsarray[1]);
		assertEquals(CaliberGeneralGlueCode.driver.getCurrentUrl().toString(), "https://revature.com/");
		driver.close();
		
		driver.switchTo().window((String) windowsarray[0]);
	}
	
	@Then("^the user clicks on the phone number$")
	public void the_user_clicks_on_the_phone_number() throws Throwable {
		pom.getFooterLink("phonenumber").click();
	}

	@Then("^the user clicks on the email$")
	public void the_user_clicks_on_the_email() throws Throwable {
		pom.getFooterLink("email").click();
	}
	
}
