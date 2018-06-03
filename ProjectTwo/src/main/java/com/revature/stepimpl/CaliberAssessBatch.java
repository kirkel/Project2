package com.revature.stepimpl;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.Keys;

import com.revature.hibernate.entity.Assessment;
import com.revature.hibernate.entity.Batch;
import com.revature.hibernate.entity.Trainee;
import com.revature.hibernate.entity.Week;
import com.revature.hibernate.services.AssessmentService;
import com.revature.hibernate.services.BatchService;
import com.revature.hibernate.services.TraineeService;
import com.revature.pom.AssessBatch;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaliberAssessBatch {

	AssessBatch assessBatch;
	
	List<Trainee> traineeList;
	List<Batch> batchList;
	Batch currentBatch;
	
	@Then("^the user is on the assess batch page for the first time$")
	public void the_user_is_on_the_assess_batch_page_for_the_first_time() throws Throwable {
		assessBatch = new AssessBatch(CaliberGeneralGlueCode.driver);
		batchList = BatchService.getAllBatches();
	}
	
	@When("^the user selects a year from the assess batch dropdown$")
	public void the_user_selects_a_year_from_the_assess_batch_dropdown() throws Throwable {
		currentBatch = batchList.get(batchList.size() - 1);
		assessBatch.getYearDropdown().click();
		Thread.sleep(250);
		assessBatch.getYearDropdownSelection(currentBatch.getStart_year()).click();
		Thread.sleep(250);
	}

	@When("^the user selects a test batch from the assess batch dropdown$")
	public void the_user_selects_a_test_batch_from_the_assess_batch_dropdown() throws Throwable {
		currentBatch = batchList.get(batchList.size() - 1);
		assessBatch.getOwnerDropdown().click();
		Thread.sleep(250);
		assessBatch.getOwnerDropdownSelection(currentBatch).click();
	}

	@Then("^the user should see the test batch on the assess batch page$")
	public void the_user_should_see_the_test_batch_on_the_assess_batch_page() throws Throwable {
		currentBatch = batchList.get(batchList.size() - 1);
		List<Trainee> traineeList = TraineeService.getAllTrainees();
		String traineeNameFound = assessBatch.getFirstTraineeFromAssessments().getAttribute("innerHTML");
		boolean passed = false;
		while(traineeList.size() > 0) {
			//System.out.println("Comparing " + traineeList.get(traineeList.size() - 1).getFullName() + " and " + traineeNameFound);
			if(traineeList.get(traineeList.size() - 1).getFullName().equals(traineeNameFound)) {
				passed = true;
				break;
			}
			traineeList.remove(traineeList.size() - 1);
		}
		assertTrue(passed);
	}

	@When("^the user creates an assessment and enters all the input$")
	public void the_user_creates_an_assessment_and_enters_all_the_input() throws Throwable {
		List<Assessment> assessmentList = AssessmentService.getAllAssessments();
		int assessmentEntered = 1;
		while(assessmentList.size() > 0) {
			Assessment currentAssessment = assessmentList.get(assessmentList.size() - 1);
			System.out.println("The current assessment is " + currentAssessment);
			Week currentWeek = currentAssessment.getWeek();	
			System.out.println("The current batch is " + currentBatch.getBatch_Id() + " and I'm looking for " + currentWeek.getBatch().getBatch_Id());
			if(currentWeek.getBatch().equals(currentBatch)) {
				System.out.println("The current week is " + currentWeek);
				assessBatch.getCreateAssessment().click();
				Thread.sleep(1000);
				assessBatch.getAssessmentCategory().click();
				Thread.sleep(500);
				assessBatch.getAssessmentCategorySelection(currentAssessment.getCategory().getName(), assessmentEntered).click();
				Thread.sleep(500);
				assessBatch.getMaxPoints().sendKeys(Keys.CONTROL + "a");
				assessBatch.getMaxPoints().sendKeys(Keys.DELETE);
				assessBatch.getMaxPoints().sendKeys(String.valueOf(currentAssessment.getMaxPoints()));
				Thread.sleep(500);
				assessBatch.getAssessmentTypeDropdown().click();
				Thread.sleep(500);
				assessBatch.getAssessmentTypeSelection(currentAssessment.getType().getName()).click();
				Thread.sleep(500);
				assessBatch.getAssessmentSave().click();
				Thread.sleep(1000);
				assessmentEntered++;
			}
			assessmentList.remove(assessmentList.size() - 1);

		}

	}

	@Then("^the user should see the assessment in the table$")
	public void the_user_should_see_the_assessment_in_the_table() throws Throwable {
		
	}

	@When("^the user enters in the assessment scores and flags the appropiate users$")
	public void the_user_enters_in_the_assessment_scores_and_flags_the_appropiate_users() throws Throwable {
		
	}

	@Then("^the user should see the asessments with data in the table$")
	public void the_user_should_see_the_asessments_with_data_in_the_table() throws Throwable {
		
	}
	
}
