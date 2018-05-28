package com.revature.stepimpl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.EnumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.hibernate.enums.SkillType;
import com.revature.hibernate.enums.TrainingType;
import com.revature.pom.ManageBatch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliberManageBatch {

	ManageBatch manageBatch;

	@Then("^the user is on the manage batch page for the first time$")
	public void the_user_is_on_the_manage_batch_page_for_the_first_time() throws Throwable {
		manageBatch = new ManageBatch(CaliberGeneralGlueCode.driver);
	}
	
	

	@Then("^the user clicks on the import batch button$")
	public void the_user_clicks_on_the_import_batch_button() throws Throwable {
		Thread.sleep(1000);
		manageBatch.importBatch();
	}

	@Then("^the user should see the import batch screen$")
	public void the_user_should_see_the_import_batch_screen() throws Throwable {
		WebDriverWait wait = new WebDriverWait(CaliberGeneralGlueCode.driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("manage")));
		assertEquals("Batch:", CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[2]/div[1]/div/label")).getAttribute("innerHTML"));
	}

	@Then("^the user clicks on the X button on the import batch screen$")
	public void the_user_clicks_on_the_X_button_on_the_import_batch_screen() throws Throwable {
		Thread.sleep(1000);
		manageBatch.exitImportBatch();
	}

	@Then("^the user imports a batch$")
	public void the_user_imports_a_batch() throws Throwable {
		Thread.sleep(1000);
		manageBatch.getImportBatchDropdown();
		Thread.sleep(1000);
		manageBatch.getImportBatchDropdown();
	}

	@Then("^the user clicks on the close import batch$")
	public void the_user_clicks_on_the_close_import_batch() throws Throwable {
		manageBatch.closeImportBatch();
	}

	
	
	
	@Then("^the user clicks on create batch$")
	public void the_user_clicks_on_create_batch() throws Throwable {
		Thread.sleep(500);
		manageBatch.createNewBatch();
		Thread.sleep(500);
	}

	@Then("^the user should see the create batch screen$")
	public void the_user_should_see_the_create_batch_screen() throws Throwable {
		Thread.sleep(500);
		WebDriverWait wait = new WebDriverWait(CaliberGeneralGlueCode.driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"batchModalLabel\"]")));
		assertEquals(CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"batchModalLabel\"]")).getAttribute("innerHTML"), "Create New Batch");	
	}
	
	@Then("^the user clicks on the X button on the create batch screen$")
	public void the_user_clicks_on_the_X_button_on_the_create_batch_screen() throws Throwable {
		Thread.sleep(500);
		manageBatch.exitCreateNewBatch();
	}

	// implement hover text check
	@Then("^the user hovers over the info for good and passing grades$")
	public void the_user_hovers_over_the_info_for_good_and_passing_grades() throws Throwable {
		
	}

	@Then("^the user clicks on the close create batch$")
	public void the_user_clicks_on_the_close_create_batch() throws Throwable {
		manageBatch.closeCreateNewBatch();
	}

	@Given("^the user clicks on save in create batch$")
	public void the_user_clicks_on_save_in_create_batch() throws Throwable {
		manageBatch.saveCreateNewBatch();
		Thread.sleep(1000);
	}
	
	
	
	@Given("^the training type \"([^\"]*)\" is valid$")
	public void the_training_type_is_valid(String arg1) throws Throwable {
		EnumUtils.isValidEnum(TrainingType.class, arg1);
	}

	@Given("^the skill type \"([^\"]*)\" is valid$")
	public void the_skill_type_is_valid(String arg1) throws Throwable {
		EnumUtils.isValidEnum(SkillType.class, arg1);
	}

	// finish location validation logic
	@Given("^the location \"([^\"]*)\" is valid$")
	public void the_location_is_valid(String arg1) throws Throwable {
	
	}
	
	// finish trainer validation 
	@Given("^the trainer \"([^\"]*)\" is valid$")
	public void the_trainer_is_valid(String arg1) throws Throwable {

	}

	// finish cotrainer validation 
	@Given("^the cotrainer \"([^\"]*)\" is valid$")
	public void the_cotrainer_is_valid(String arg1) throws Throwable {

	}
	
	@Given("^the trainer \"([^\"]*)\" and cotrainer \"([^\"]*)\" are not the same$")
	public void the_trainer_and_cotrainer_are_not_the_same(String arg1, String arg2) throws Throwable {
		assertNotEquals(arg1, arg2);
	}
	
	@Given("^the year \"([^\"]*)\" is valid$")
	public void the_year_is_valid(String arg1) throws Throwable {
		int year = 0;
		try {
			year = Integer.parseInt(arg1);
			if(year > 2019 || year < 2016) {
				throw new InvalidSelectorException("Year is not valid. Must be between 2016 and 2019");
			}
		} catch(InvalidSelectorException ise) {
//			LogHere.warn(ise.getMessage());
		}
	}
	
	@Given("^the start date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" is before the end date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_start_date_is_before_the_end_date(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		int startDay = 0, startMonth = 0, startYear = 0;
		int endDay = 0, endMonth = 0, endYear = 0;
		
		try {
			startMonth = Integer.parseInt(arg1);
			startDay = Integer.parseInt(arg2);
			startYear = Integer.parseInt(arg3);
			endMonth = Integer.parseInt(arg4);
			endDay = Integer.parseInt(arg5);
			endYear = Integer.parseInt(arg6);
			
			LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
			LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);
			
			if(startDate.compareTo(endDate) > 0) {
				throw new InvalidSelectorException("Start date must be before end date");
			}
		} catch(InvalidSelectorException ise) {
//			LogHere.warn(ise.getMessage());
		}
	}
	
	@Given("^the good grade \"([^\"]*)\" is higher than the passing grade \"([^\"]*)\"$")
	public void the_good_grade_is_higher_than_the_passing_grade(String arg1, String arg2) throws Throwable {
		int goodGrade = 0, passingGrade = 0;
		try {
			goodGrade = Integer.parseInt(arg1);
			passingGrade = Integer.parseInt(arg2);
			if(goodGrade > passingGrade) {
				throw new InvalidSelectorException("Good grade must be higher than passing grade");
			}
		} catch(InvalidSelectorException ise) {
//			LogHere.warn(ise.getMessage());
		}
	}
	
	
	
	@Given("^the user adds a good grade \"([^\"]*)\"$")
	public void the_user_adds_a_good_grade(String arg1) throws Throwable {
		manageBatch.getGoodGrade().sendKeys(arg1);
	}

	@Given("^the user adds a passing grade \"([^\"]*)\"$")
	public void the_user_adds_a_passing_grade(String arg1) throws Throwable {
		CaliberGeneralGlueCode.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    manageBatch.getPassingGrade().sendKeys(Keys.CONTROL + "a");
	    manageBatch.getPassingGrade().sendKeys(Keys.DELETE);
	    manageBatch.getPassingGrade().sendKeys(arg1);
	}

	@Then("^the user adds a start date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_user_adds_a_start_date(String month, String day, String year) throws Throwable {
		String startDate = "";
		System.out.println("The input start date is " + startDate.concat(year + "-" + month + "-" + day));
		manageBatch.getStartDateInput((startDate.concat(month + "-" + day + "-" + year)));
	}

	@Then("^the user adds an end date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_user_adds_an_end_date(String month, String day, String year) throws Throwable {
		String endDate = "";
		System.out.println("The input end date is " + endDate.concat(year + "-" + month + "-" + day));
		manageBatch.getEndDateInput((endDate.concat(month + "-" + day + "-" + year)));
	}
	
	@Then("^the user adds a training name \"([^\"]*)\"$")
	public void the_user_adds_a_training_name(String arg1) throws Throwable {
		manageBatch.getTrainingName(arg1);
	}

	@Then("^the user adds a training type \"([^\"]*)\"$")
	public void the_user_adds_a_training_type(String arg1) throws Throwable {
		manageBatch.getDropdownSelection("trainingType", arg1);
	}

	@Then("^the user adds a skill type \"([^\"]*)\"$")
	public void the_user_adds_a_skill_type(String arg1) throws Throwable {
		manageBatch.getDropdownSelection("skillType", arg1);
	}
	
	@Then("^the user adds a location \"([^\"]*)\"$")
	public void the_user_adds_a_location(String arg1) throws Throwable {
		manageBatch.getDropdownSelection("location", arg1);
	}

	@Then("^the user adds a trainer \"([^\"]*)\"$")
	public void the_user_adds_a_trainer(String arg1) throws Throwable {
		manageBatch.getDropdownSelection("trainer", arg1);
	}

	@Then("^the user adds a cotrainer \"([^\"]*)\"$")
	public void the_user_adds_a_cotrainer(String arg1) throws Throwable {
		manageBatch.getDropdownSelection("co-trainer", arg1);
	}
	
	
	// finish batch validation 
	@Then("^the user should see the correct \"([^\"]*)\" given the correct starting year \"([^\"]*)\" and correct training name \"([^\"]*)\"$")
	public void the_user_should_see_the_correct_given_the_correct_starting_year_and_correct_training_name(String arg1, String arg2, String arg3) throws Throwable {
		manageBatch.getYearSelection(arg2);
		Thread.sleep(1000);
		
		System.out.println(CaliberGeneralGlueCode.driver.findElement(By.linkText(arg3)).getAttribute("innerHTML"));
		
		
	}
	

	

}
