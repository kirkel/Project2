package com.revature.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.hibernate.entity.Batch;

public class AssessBatch extends HomePage {

	public AssessBatch(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getYearDropdown() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[1]/a"));
	}
	
	public WebElement getYearDropdownSelection(int year) {
		switch(year) {
		case 2019:
			year = 1;
			break;
		case 2018:
			year = 2;
			break;
		case 2017:
			year = 3;
			break;
		case 2016:
			year = 4;
			break;
		default: 
			throw new IllegalArgumentException("The year must be between 2016 and 2019");
		}
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[1]/ul/li[" + year + "]/a"));
	}
	
	public WebElement getOwnerDropdown() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]/a"));
	}
	
	public WebElement getOwnerDropdownSelection(Batch batch) {
		String trainer = batch.getTrainer().getName();
		String shortYear = String.valueOf(batch.getStart_year());
		String startDate = batch.getStart_month() + "/" + batch.getStart_day() + "/" + shortYear.substring(2, 4);
		
		String dropdownFinder = trainer + " - "+ startDate;
		
		List<WebElement> dropdownElements = driver.findElements(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]/ul/li"));
		if(dropdownElements.size() == 0)
			throw new IllegalArgumentException("Something has gone wrong in the selection of a batch in the dropdown menu in the AssessBatch POM");
		else if(dropdownElements.size() == 1) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]/ul/li/a"));
		} else {
			int selection = dropdownElements.size() - 1;
			while(selection > 0) {
				WebElement toBeReturned = driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]/ul/li[" + selection + "]/a"));
				if(toBeReturned.getAttribute("innerHTML").trim().equals(dropdownFinder.trim())) {
					return toBeReturned;
				}
				selection--;
			}
		}
		throw new IllegalArgumentException("Could not find the batch on the assessment page");
	}
	
	public WebElement getCreateAssessment() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[3]/a"));
	}
	
	// -------------- Create Assessment screen --------------
	
	public WebElement getAssessmentSave() {
		return driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[2]/input"));
	}
	
	public WebElement getAssessmentClose() {
		return driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[2]/button"));
	}
	
	public WebElement getAssessmentExit() {
		return driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/div/button"));
	}
	
	public WebElement getAssessmentCategory() {
		return driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[1]/div[1]/div"));
	}
	
	public WebElement getAssessmentCategorySelection(String assessmentCategory) {
//		int selectionLength = driver.findElements(By.xpath("//*[@id=\"category\"]/option")).size() - 1;
		// the above seems to be bugging out for no reason, so I'm hard coding this
		int selectionLength = 46;
		System.out.println("The number of options found is " + selectionLength);
		while(selectionLength > 0) {
			WebElement toBeReturned = driver.findElement(By.xpath("//*[@id=\"category\"]/option[" + selectionLength + "]"));
			System.out.println("The category I want is " + assessmentCategory + " and I found " + toBeReturned.getAttribute("innerHTML"));
			if(toBeReturned.getAttribute("innerHTML").equals(assessmentCategory)) {
				return toBeReturned;
			}
			selectionLength--;
		}
		throw new IllegalArgumentException("Could not find the assessment category on the assessment page");
	}
	
	public WebElement getMaxPoints() {
		return driver.findElement(By.xpath("//*[@id=\"rawScore\"]"));
	}
	
	public WebElement getAssessmentTypeDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"assessmentType\"]"));
	}
	
	public WebElement getAssessmentTypeSelection(String type) {
		int selectionLength = driver.findElements(By.xpath("//*[@id=\"assessmentType\"]/option")).size() - 1;
		while(selectionLength > 0) {
			WebElement toBeReturned = driver.findElement(By.xpath("//*[@id=\"assessmentType\"]/option[" + selectionLength + "]"));
			if(toBeReturned.getAttribute("innerHTML").equals(type)) {
				return toBeReturned;
			}
			selectionLength--;
		}
		throw new IllegalArgumentException("Could not find the assessment type on the assessment page");
	}
	
	public WebElement getFirstTraineeFromAssessments() {
		return driver.findElement(By.xpath("//*[@id=\"trainer-assess-table\"]/div/div/ul/ul/table/tbody/tr[1]/td[1]"));
	}
	

	

}
