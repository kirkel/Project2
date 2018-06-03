package com.revature.stepimpl;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.EnumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.hibernate.entity.Batch;
import com.revature.hibernate.entity.Trainee;
import com.revature.hibernate.enums.SkillType;
import com.revature.hibernate.enums.TrainingType;
import com.revature.hibernate.services.BatchService;
import com.revature.hibernate.services.TraineeService;
import com.revature.logs.LogHere;
import com.revature.pom.ManageBatch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaliberManageBatch {

	ManageBatch manageBatch;
	
	List<Trainee> traineeList;
	List<Batch> batchList;
	Batch currentBatch;
	

	@Then("^the user is on the manage batch page for the first time$")
	public void the_user_is_on_the_manage_batch_page_for_the_first_time() throws Throwable {
		manageBatch = new ManageBatch(CaliberGeneralGlueCode.driver);
		batchList = BatchService.getAllBatches();
	}
	
	@When("^the user inputs all of the batch information$")
	public void the_user_inputs_all_of_the_batch_information() throws Throwable {
		currentBatch = batchList.get(batchList.size() - 1);
		traineeList = currentBatch.getTrainees();
		
		manageBatch.getWebElementWithId("trainingName").sendKeys(currentBatch.getTrainingName());
		manageBatch.getWebElementWithId("trainingType").sendKeys(currentBatch.getTrainingType().toString());
		manageBatch.getDropdownSelection("skillType", currentBatch.getSkillType().getName().toString());
		manageBatch.getDropdownSelection("location", currentBatch.getTrainingLocation().getName());
		manageBatch.getDropdownSelection("trainer", currentBatch.getTrainer().getName());
		
		String startDay = String.valueOf(currentBatch.getStart_day());
		String endDay = String.valueOf(currentBatch.getEnd_day());
		if(currentBatch.getStart_day() < 10) {
			 startDay = "0" + currentBatch.getStart_day();
		}
		if(currentBatch.getEnd_day() < 10) {
			endDay = "0" + currentBatch.getEnd_day();
		}
		
		String startDate = "";
		manageBatch.getDateElement("start-date").sendKeys((startDate.concat(currentBatch.getStart_month() + "-" + startDay + "-" + currentBatch.getStart_year())));
		
		String endDate = "";
		manageBatch.getDateElement("end-date").sendKeys((endDate.concat(currentBatch.getEnd_month() + "-" + endDay + "-" + currentBatch.getEnd_year())));
		
		Thread.sleep(250);
		manageBatch.getWebElementWithId("goodGrade").sendKeys(String.valueOf(currentBatch.getGoodGrade()));
		CaliberGeneralGlueCode.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    manageBatch.getWebElementWithId("borderlineGrade").sendKeys(Keys.CONTROL + "a");
	    manageBatch.getWebElementWithId("borderlineGrade").sendKeys(Keys.DELETE);
	    manageBatch.getWebElementWithId("borderlineGrade").sendKeys(String.valueOf(currentBatch.getPassingGrade()));
	}

	@Then("^the user should see the correct data on the batch table$")
	public void the_user_should_see_the_correct_data_on_the_batch_table() throws Throwable {
	    Thread.sleep(3000);
		manageBatch.selectYearDropdown(String.valueOf(currentBatch.getStart_year())).click();
		Thread.sleep(2000);
		String batchName = manageBatch.getBatchTableEntry("trainingName", currentBatch.getTrainingName(), "trainingName").getAttribute("innerHTML");
		assertTrue(batchName.equals(currentBatch.getTrainingName()));	
	}
	
	@When("^the user inputs all of the trainee information$")
	public void the_user_inputs_all_of_the_trainee_information() throws Throwable {
		Thread.sleep(1000);
		manageBatch.getTraineeScreen(currentBatch.getTrainingName()).click();
		currentBatch = batchList.get(batchList.size() - 1);
		traineeList = TraineeService.getAllTrainees();
		while(traineeList.size() > 0) {
			Trainee currentTrainee = traineeList.get(traineeList.size() - 1);
			if(!currentTrainee.getBatch().equals(currentBatch)) {
				traineeList.remove(traineeList.size() - 1);
			} else {
				System.out.println("Found a matching trainee!");
				Thread.sleep(1000);
				manageBatch.getAddNewTrainee().click();
				Trainee newTrainee = traineeList.get(traineeList.size() - 1);
				traineeList.remove(traineeList.size() - 1);
				Thread.sleep(2000);

				
				manageBatch.getAddNewTraineeInfo("traineeName").sendKeys(newTrainee.getFullName());
				manageBatch.getAddNewTraineeInfo("traineeEmail").sendKeys(newTrainee.getEmail());
				if(newTrainee.getSkypeId() == null) {} else {
					manageBatch.getAddNewTraineeInfo("traineeSkype").sendKeys(newTrainee.getSkypeId());
				}
				manageBatch.getAddNewTraineeInfo("traineePhone").sendKeys(String.valueOf(newTrainee.getPhonenumber()));
				manageBatch.getAddNewTraineeInfo("traineeCollege").sendKeys(newTrainee.getCollege());
				manageBatch.getAddNewTraineeInfo("traineeDegree").sendKeys(newTrainee.getDegree());
				manageBatch.getAddNewTraineeInfo("traineeMajor").sendKeys(newTrainee.getMajor());
				manageBatch.getAddNewTraineeInfo("traineeRecruiterName").sendKeys(newTrainee.getRecruiterName());
				manageBatch.getAddNewTraineeInfo("traineeTechScreenerName").sendKeys(newTrainee.getTechScreenerName());
				manageBatch.getAddNewTraineeInfo("traineeProjectCompletion").sendKeys(String.valueOf(newTrainee.getProjectCompletion()));
				manageBatch.getNewTraineeTrainingStatus(newTrainee.getStatus().getName()).click();
				CaliberGeneralGlueCode.driver.findElement(By.xpath("//*[@id=\"addTraineeModal\"]/div/div/div[2]/div[1]/div[7]/div/label")).click();
				Thread.sleep(1000);
				manageBatch.saveNewTrainee().click();
				Thread.sleep(1000);
			}
		}
		manageBatch.exitTraineeScreen().click();
		
		Thread.sleep(3000);
		manageBatch.selectYearDropdown(String.valueOf(currentBatch.getStart_year())).click();
		Thread.sleep(2000);
		String batchName = manageBatch.getBatchTableEntry("trainingName", currentBatch.getTrainingName(), "trainingName").getAttribute("innerHTML");
		assertTrue(batchName.equals(currentBatch.getTrainingName()));
	}
	
	@Given("^the user clicks on add a trainee to the batch$")
	public void the_user_clicks_on_add_a_trainee_to_the_batch() throws Throwable {
		Thread.sleep(1000);
		manageBatch.getTraineeScreen(currentBatch.getTrainingName()).click();
		Thread.sleep(2000);
		manageBatch.getAddNewTrainee().click();
	}
	
	
	// -------------------------------- Import Batch --------------------------------
	@Then("^the user clicks on the import batch button$")
	public void the_user_clicks_on_the_import_batch_button() throws Throwable {
		Thread.sleep(1000);
		manageBatch.importBatch().click();
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
		manageBatch.exitImportBatch().click();
	}

	@Then("^the user imports a batch$")
	public void the_user_imports_a_batch() throws Throwable {
		Thread.sleep(1000);
		manageBatch.getWebElementWithId("importId").click();
		Thread.sleep(1000);
		manageBatch.getWebElementWithId("importId").click();
	}

	@Then("^the user clicks on the close import batch$")
	public void the_user_clicks_on_the_close_import_batch() throws Throwable {
		manageBatch.closeImportBatch().click();
	}

	
	
	// -------------------------------- Create New Batch Screen Test --------------------------------
	@Then("^the user clicks on create batch$")
	public void the_user_clicks_on_create_batch() throws Throwable {
		Thread.sleep(500);
		manageBatch.createNewBatch().click();
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
		manageBatch.exitCreateNewBatch().click();
	}

	// implement hover text check ** 
	@Then("^the user hovers over the info for good and passing grades$")
	public void the_user_hovers_over_the_info_for_good_and_passing_grades() throws Throwable {
	}

	@Then("^the user clicks on the close create batch$")
	public void the_user_clicks_on_the_close_create_batch() throws Throwable {
		manageBatch.closeCreateNewBatch().click();
	}

	@Given("^the user clicks on save in create batch$")
	public void the_user_clicks_on_save_in_create_batch() throws Throwable {
		manageBatch.saveCreateNewBatch().click();
		Thread.sleep(1000);
	}
	
	
	// -------------------------------- Create New Batch Input Validation --------------------------------
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
			LogHere.warn(ise.getMessage());
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
		goodGrade = Integer.parseInt(arg1);
		passingGrade = Integer.parseInt(arg2);
		if(goodGrade < passingGrade) {
			throw new InvalidSelectorException("Good grade must be higher than passing grade");
		}
	}
	
	
	// -------------------------------- Create New Batch Input --------------------------------
	
	@Given("^the user adds a good grade \"([^\"]*)\"$")
	public void the_user_adds_a_good_grade(String arg1) throws Throwable {
		manageBatch.getWebElementWithId("goodGrade").sendKeys(arg1);
	}

	@Given("^the user adds a passing grade \"([^\"]*)\"$")
	public void the_user_adds_a_passing_grade(String arg1) throws Throwable {
		CaliberGeneralGlueCode.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    manageBatch.getWebElementWithId("borderlineGrade").sendKeys(Keys.CONTROL + "a");
	    manageBatch.getWebElementWithId("borderlineGrade").sendKeys(Keys.DELETE);
	    manageBatch.getWebElementWithId("borderlineGrade").sendKeys(arg1);
	}

	@Then("^the user adds a start date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_user_adds_a_start_date(String month, String day, String year) throws Throwable {
		String startDate = "";
		System.out.println("The input start date is " + startDate.concat(year + "-" + month + "-" + day));
		manageBatch.getDateElement("start-date").sendKeys((startDate.concat(month + "-" + day + "-" + year)));
	}

	@Then("^the user adds an end date \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_user_adds_an_end_date(String month, String day, String year) throws Throwable {
		String endDate = "";
		System.out.println("The input end date is " + endDate.concat(year + "-" + month + "-" + day));
		manageBatch.getDateElement("end-date").sendKeys((endDate.concat(month + "-" + day + "-" + year)));
	}
	
	@Then("^the user adds a training name \"([^\"]*)\"$")
	public void the_user_adds_a_training_name(String arg1) throws Throwable {
		manageBatch.getWebElementWithId("trainingName").sendKeys(arg1);
	}

	@Then("^the user adds a training type \"([^\"]*)\"$")
	public void the_user_adds_a_training_type(String arg1) throws Throwable {
		manageBatch.getWebElementWithId("trainingType").sendKeys(arg1);
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
	
	
	// -------------------------------- Batch Created Validation --------------------------------
	
	@Given("^the user has selected a year with a batch$")
	public void the_user_has_selected_a_year_with_a_batch() throws Throwable {
		Thread.sleep(1000);
		manageBatch.selectYearDropdown("2016");
	}
	
	@Then("^the user should see the correct data given the starting year \"([^\"]*)\" and training name \"([^\"]*)\"$")
	public void the_user_should_see_the_correct_data_given_the_starting_year_and_training_name(String arg1, String arg2) throws Throwable {
		Thread.sleep(1000);
		manageBatch.selectYearDropdown(arg1).click();
		Thread.sleep(2000);
		
		String batchName = manageBatch.getBatchTableEntry("trainingName", arg2, "trainingName").getAttribute("innerHTML");
		assertTrue(batchName.equals(arg2));
		
	}
	
	
	// -------------------------------- Add Trainee Screen Test --------------------------------

	@Given("^the user clicks on add a trainee to the batch with the name \"([^\"]*)\"$")
	public void the_user_clicks_on_add_a_trainee_to_the_batch_with_the_name(String arg1) throws Throwable {
		
	}


	@Then("^the user should see the add a trainee screen$")
	public void the_user_should_see_the_add_a_trainee_screen() throws Throwable {
		assertEquals(manageBatch.getNewTraineeScreenTitle().getAttribute("innerHTML"), "Add Trainee");
	}

	@When("^the user clicks on the exit from the trainee screen$")
	public void the_user_clicks_on_the_exit_from_the_trainee_screen() throws Throwable {
		Thread.sleep(1000);
		manageBatch.exitTraineeScreen().click();
	}

	@When("^the user clicks on close from the add a trainee screen$")
	public void the_user_clicks_on_close_from_the_add_a_trainee_screen() throws Throwable {
		manageBatch.exitNewTraineeScreen().click();
	}
	
	@Given("^the user clicks on save in the add trainee screen$")
	public void the_user_clicks_on_save_in_the_add_trainee_screen() throws Throwable {
		manageBatch.saveNewTrainee().click();
	}
	
	// -------------------------------- Add Trainee Input Validation --------------------------------

	// verify trainee name is valid (?) 
	// can leave blank; not sure how to accomplish this 
	@Given("^the trainee has a name \"([^\"]*)\"$")
	public void the_trainee_has_a_name(String arg1) throws Throwable {
	}

	// verify email is valid
	@Given("^the trainee has an email \"([^\"]*)\" in the proper format$")
	public void the_trainee_has_an_email_in_the_proper_format(String arg1) throws Throwable {
	    boolean passed = false;
		if(arg1.contains("@")) {
			if(arg1.contains(".")) {
				passed = true;
			}
	    }
		assertTrue(passed);
	}

	// verify the skypeId is valid (?)
	// can leave blank; not sure how to accomplish this 
	@Given("^the trainee has an optional skypeId \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_skypeId(String arg1) throws Throwable {
	}

	// verify the phone number is valid 
	@Given("^the trainee has an optional phone number \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_phone_number(String arg1) throws Throwable {
	    if(arg1.length() != 9) {
	    	throw new NumberFormatException("The phone number is not valid");
	    }
	}

	// verify the college is valid (?) 
	// can leave blank; not sure how to accomplish this 
	@Given("^the trainee has an optional college \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_college(String arg1) throws Throwable {
	}

	// verify the degree is valid
	// can leave blank; not sure how to accomplish this 
	@Given("^the trainee has an optional degree \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_degree(String arg1) throws Throwable {
	}

	// verify the major is valid
	// can leave blank; not sure how to accomplish this 
	@Given("^the trainee has an optional major \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_major(String arg1) throws Throwable {
	}

	// verify the recruiter is valid
	// can leave blank; not sure how to accomplish this 
	@Given("^the trainee has an optional recruiter name \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_recruiter_name(String arg1) throws Throwable { 
	}

	// verify the tech screener is valid
	// can leave blank; not sure how to accomplish this 
	@Given("^the trainee has an optional tech screener name \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_tech_screener_name(String arg1) throws Throwable {
	}

	// verify the project completion percent is valid
	@Given("^the trainee has an optional project completion \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_project_completion(String arg1) throws Throwable {
		if(Integer.parseInt(arg1) > 100 || Integer.parseInt(arg1) < 0) {
	    	throw new NumberFormatException("The phone number is not valid");
		}
	}

	// verify the URL is valid 
	// not a very good test, but it's better than nothing 
	@Given("^the trainee has an optional profile URL \"([^\"]*)\"$")
	public void the_trainee_has_an_optional_profile_URL(String arg1) throws Throwable {
		boolean passed = false;
		if(arg1.contains(".")) {
			if(arg1.contains("www")) {
				passed = true;
			}
		}
		assertTrue(passed);
	}

	// verify the training status is valid 
	// I mean it's a drop down lol 
	@Given("^the trainee has a training status \"([^\"]*)\"$")
	public void the_trainee_has_a_training_status(String arg1) throws Throwable {
	}
	
}
