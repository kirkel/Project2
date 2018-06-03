package com.revature.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.hibernate.entity.Batch;

public class Reports  extends POM{

	public Reports(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getSearchBar() {
		return driver.findElement(By.xpath("//*[@id=\"searchTextBox\"]"));
	}
	
	public WebElement getChartsDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"dropdownMenu1\"]/span[1]/i"));
	}
	
	//1: charts, 2: chartsandfeedback
	public WebElement getChartsDropdownSelection(int charts_chartsandfeedback) {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/div[2]/ul/li[" + charts_chartsandfeedback + "]/a"));
	}
	
	public WebElement getCumuliativeScoresDownload() {
		return driver.findElement(By.xpath("//*[@id=\"caliber-container\"]/div/div/div[1]/div[1]/div/div/div[1]/i"));
	}
	
	public WebElement getBatchQCReportDownload() {
		return driver.findElement(By.xpath("//*[@id=\"caliber-container\"]/div/div/div[1]/div[2]/div/div/div/div/div[1]/i"));
	}
	
	public WebElement getTechnicalSkillsDownload() {
		return driver.findElement(By.xpath("//*[@id=\"caliber-container\"]/div/div/div[2]/div[1]/div/div[1]/i"));
	}
	
	public WebElement getWeeklyProgressDownload() {
		return driver.findElement(By.xpath("//*[@id=\"caliber-container\"]/div/div/div[2]/div[2]/div[1]/div[1]/i"));
	}
	
	public WebElement selectYearDropdown(int year) {
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[1]/a")).click();
		int selection = 0;
		switch(year) {
		case 2019:
			selection = 1;
			break;
		case 2018:
			selection = 2;
			break;
		case 2017:
			selection = 3;
			break;
		case 2016:
			selection = 4;
			break;
		default: 
			throw new IllegalArgumentException("The year must be between 2016 and 2019");
		}
		System.out.println("This should be a year " + driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[1]/ul/li[" + selection + "]/a")).getAttribute("innerHTML").trim());
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[1]/ul/li[" + selection + "]/a"));
	}
	
	public WebElement getOwnerDropdown() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[2]/a"));
	}
	
	public WebElement getOwnerDropdownSelection(Batch batch) {
		String trainer = batch.getTrainer().getName();
		String shortYear = String.valueOf(batch.getStart_year());
		String startDate = batch.getStart_month() + "/" + batch.getStart_day() + "/" + shortYear.substring(2, 4);
		String dropdownFinder = trainer + "								- "+ startDate;
		
		List<WebElement> dropdownElements = driver.findElements(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[2]/ul/li"));
		if(dropdownElements.size() == 0)
			throw new IllegalArgumentException("Something has gone wrong in the selection of a batch in the dropdown menu in the AssessBatch POM");
		else if(dropdownElements.size() == 1) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[2]/ul/li/a"));
		} else {
			int selection = dropdownElements.size();
			System.out.println("The selection count is " + selection);
			while(selection > 0) {
				WebElement toBeReturned = driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[2]/ul/li[" + selection + "]/a"));
				String neat2 = toBeReturned.getAttribute("innerHTML").replaceAll("[\n\r]", "").trim();
				System.out.println("Comparing " + neat2 + " and " + dropdownFinder.trim());
				if(neat2.equals(dropdownFinder)) {
					return toBeReturned;
				}
				selection--;
			}
		}
		throw new IllegalArgumentException("Could not find the batch on the assessment page");
	}
	
	public WebElement getWeekDropdown() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[3]/a"));
	}
	
	public WebElement getWeekDropdownSelection(int week) {
		int selection = week + 1;
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[3]/ul/li[" + selection + "]/a"));
	}
	
	public WebElement getTraineeDropdown() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[4]/a"));
	}
	
	public WebElement getTraineeDropdownSelection(String traineeName) {
		if(traineeName.equals("All"))
			return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[4]/ul/li[1]/a"));
		List<WebElement> traineeWebElements = driver.findElements(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[4]/ul/li"));
		int traineeCount = traineeWebElements.size() - 1;
		while(traineeCount > 0) {
			WebElement toBeReturned = driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[4]/ul/li[" + traineeCount + "]/a"));
			System.out.println("Comparing " + traineeName + " and " + toBeReturned.getAttribute("innerHTML"));
			if(toBeReturned.getAttribute("innerHTML").equals(traineeName)) {
				return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div/ul/li[4]/ul/li[" + traineeCount + "]/a")); 
			}
			traineeCount--;
		}
		throw new IllegalArgumentException("Could not find the trainee on the reports page in the dropdown");
	}

}
