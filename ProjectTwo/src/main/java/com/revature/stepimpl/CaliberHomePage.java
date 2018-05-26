package com.revature.stepimpl;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.driver.DriverFactory;
import com.revature.pom.HomePage;
import com.revature.pom.ManageBatch;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaliberHomePage {

	WebDriver driver;
	WebDriverWait wait;
	HomePage home;
	ManageBatch manageBatch;
	
	@Given("^a user opens a web browser$")
	public void a_user_opens_a_web_browser() throws Throwable {
		driver = DriverFactory.getDriver("chrome");
		driver.manage().window().maximize();
		
		System.out.println("Please wait");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		wait = new WebDriverWait(driver, 10);
		System.out.println("Apparently done waiting lol");
		
	}
	
	@Given("^navigates to the Caliber website$")
	public void navigates_to_the_Caliber_website() throws Throwable {
		home = new HomePage(driver);
		assertEquals("Caliber | Performance Management", home.getPageTitle());
	}

	@When("^a user clicks on the Manage Batch button$")
	public void a_user_clicks_on_the_Manage_Batch_button() throws Throwable {
		home.getManageBatchButton();
	}
	
	@Then("^the user sees the Manage Batch Page$")
	public void the_user_sees_the_Manage_Batch_Page() throws Throwable {
		assertEquals(driver.findElement(By.id("manage")), driver.findElement(By.xpath("//*[@id=\"manage\"]")));
	}
	
	@Given("^the user creates a new batch$")
	public void the_user_creates_a_new_batch() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]")).click();
	}

	@Given("^has the training name \"([^\"]*)\"$")
	public void has_the_training_name(String arg1) throws Throwable {
		manageBatch.getIdSelector("trainingName").sendKeys(arg1);
	}

	@Given("^has the training type \"([^\"]*)\"$")
	public void has_the_training_type(String arg1) throws Throwable {
		manageBatch.getIdSelector("trainingType").sendKeys(arg1);
	}

	@Given("^has the skill type \"([^\"]*)\"$")
	public void has_the_skill_type(String arg1) throws Throwable {
		manageBatch.getIdSelector("skillType").sendKeys(arg1);
	}

	@Given("^has the location \"([^\"]*)\"$")
	public void has_the_location(String arg1) throws Throwable {
		manageBatch.getIdSelector("Location").sendKeys(arg1);
	}

	@Given("^has the trainer \"([^\"]*)\"$")
	public void has_the_trainer(String arg1) throws Throwable {
		manageBatch.getIdSelector("trainer").sendKeys(arg1);
	}

	@Given("^has the co-trainer \"([^\"]*)\"$")
	public void has_the_co_trainer(String arg1) throws Throwable {
		manageBatch.getIdSelector("co-trainer").sendKeys(arg1);
	}

	@Given("^has the start date day (\\d+) and month (\\d+) and year (\\d+)$")
	public void has_the_start_date_day_and_month_and_year(int arg1, int arg2, int arg3) throws Throwable {
		
	}

	@Given("^has the end date day (\\d+) and month (\\d+) and year (\\d+)$")
	public void has_the_end_date_day_and_month_and_year(int arg1, int arg2, int arg3) throws Throwable {
		
	}

	@Given("^has the good grade (\\d+)$")
	public void has_the_good_grade(int arg1) throws Throwable {
		
	}

	@Given("^has the passing grade (\\d+)$")
	public void has_the_passing_grade(int arg1) throws Throwable {
		
	}

	@Then("^the user sees the new batch$")
	public void the_user_sees_the_new_batch() throws Throwable {
		
	}
	
	
	
	@After  
	public void shutdowndriver() {
		driver.quit();
	}
	
}
