package com.revature.stepimpl;

import java.util.List;

import com.revature.hibernate.entity.Batch;
import com.revature.hibernate.entity.Trainee;
import com.revature.hibernate.services.BatchService;
import com.revature.hibernate.services.TraineeService;
import com.revature.pom.Reports;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaliberReports {

	List<Trainee> traineeList;
	List<Batch> batchList;
	Batch currentBatch;
	
	Reports reports;
	
	@Then("^the user is on the reports page for the first time$")
	public void the_user_is_on_the_reports_page_for_the_first_time() throws Throwable {
		reports = new Reports(CaliberGeneralGlueCode.driver);
		batchList = BatchService.getAllBatches();
	}
	
	@When("^a user selects a year from the reports page dropdown$")
	public void a_user_selects_a_year_from_the_reports_page_dropdown() throws Throwable {
		currentBatch = batchList.get(batchList.size() - 1);
		Thread.sleep(250);
		reports.selectYearDropdown(currentBatch.getStart_year()).click();
	}

	@When("^the user selects a test bach from the assess batch dropdown$")
	public void the_user_selects_a_test_bach_from_the_assess_batch_dropdown() throws Throwable {
		reports.getOwnerDropdown().click();
		Thread.sleep(250);
		reports.getOwnerDropdownSelection(currentBatch).click();
	}

	@Then("^the user should see the test batch on the page$")
	public void the_user_should_see_the_test_batch_on_the_page() throws Throwable {
		
	}
	
	@When("^the user selects a trainee from the test batch in the assess batch dropdown$")
	public void the_user_selects_a_trainee_from_the_test_batch_in_the_assess_batch_dropdown() throws Throwable {
		reports.getTraineeDropdown().click();
		Thread.sleep(250);
		traineeList = TraineeService.getAllTrainees();
		while(traineeList.size() > 0) {
			Trainee currentTrainee = traineeList.get(traineeList.size() - 1);
			if(!currentTrainee.getBatch().equals(currentBatch)) {
				traineeList.remove(traineeList.size() - 1);
			} else {
				System.out.println("Found a matching trainee!");
				Thread.sleep(250);
				
				reports.getTraineeDropdownSelection(currentTrainee.getFullName()).click();
				Thread.sleep(250);
				break;
			}
		}
		
	}
	
	@Then("^the user downloads all the data$")
	public void the_user_downloads_all_the_data() throws Throwable {
		reports.getBatchQCReportDownload().click();
		reports.getCumuliativeScoresDownload().click();
		reports.getTechnicalSkillsDownload().click();
		reports.getWeeklyProgressDownload().click();
	}
}
