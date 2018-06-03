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
	
	public WebElement getFirstTrainee() {
		return driver.findElement(By.xpath("//*[@id=\"trainer-assess-table\"]/div/div/ul/ul/table/tbody/tr[1]/td[1]"));
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
	
	public WebElement getAssessmentCategorySelection(String assessmentCategory, int existingAssessments) {
		int selectionLength = 0;
		List<WebElement> elementList = driver.findElements(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[1]/div[1]/div/select/option"));
		selectionLength = elementList.size() - 1;
//		System.out.println("The selection length is " + selectionLength);
		while(selectionLength > 0) {
//			System.out.println("The category I want is " + assessmentCategory + " and I found " + elementList.get(selectionLength).getAttribute("innerHTML"));
			if(elementList.get(selectionLength).getAttribute("innerHTML").equals(assessmentCategory)) {
				selectionLength++;
//				System.out.println("Success! The options value is " + selectionLength);
//				System.out.println(driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[1]/div[1]/div/select/option[" + selectionLength + "]")).getAttribute("innerHTML"));
				return driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[1]/div[1]/div/select/option[" + selectionLength + "]"));
			}
			selectionLength--;
		}
		throw new IllegalArgumentException("Could not find the assessment category on the assessment page");
	}
	
	public WebElement getMaxPoints() {
		return driver.findElement(By.xpath("//*[@id=\"rawScore\"]"));
	}
	
	public WebElement getAssessmentTypeDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[1]/div[2]/div[2]"));
	}
	
	public WebElement getAssessmentTypeSelection(String type) {
		int selectionLength = 0;
		List<WebElement> elementList = driver.findElements(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[1]/div[2]/div[2]/select/option"));
		selectionLength = elementList.size() - 1;
//		System.out.println("The selection length for types is " + selectionLength);
		while(selectionLength > 0) {
//			System.out.println("The category I want is " + type + " and I found " + elementList.get(selectionLength).getAttribute("innerHTML"));
			if(elementList.get(selectionLength).getAttribute("innerHTML").equals(type)) {
				selectionLength++;
//				System.out.println("Success! The options value is " + selectionLength);
//				System.out.println(driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[1]/div[2]/div[2]/select/option[" + selectionLength + "]")).getAttribute("innerHTML"));
				return driver.findElement(By.xpath("//*[@id=\"createAssessmentModal\"]/div/div/form/div[1]/div[2]/div[2]/select/option[" + selectionLength + "]"));
			}
			selectionLength--;
		}
		throw new IllegalArgumentException("Could not find the assessment type on the assessment page");
	}
	
	public WebElement getFirstTraineeFromAssessments() {
		return driver.findElement(By.xpath("//*[@id=\"trainer-assess-table\"]/div/div/ul/ul/table/tbody/tr[1]/td[1]"));
	}
	

	

}
