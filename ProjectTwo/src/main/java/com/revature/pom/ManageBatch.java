package com.revature.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ManageBatch extends POM{


	public ManageBatch(WebDriver driver) {
		super(driver);
	}	
	
	public WebElement getYearDropdown() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/a"));
	}
	
	public WebElement selectYearDropdown(String year) {
		int yearselection = Integer.parseInt(year);
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/a")).click();
		int selection = 0;
		if(yearselection == 2019)
			selection = 1;
		if(yearselection == 2018)
			selection = 2;
		if(yearselection == 2017)
			selection = 3;
		if(yearselection == 2016)
			selection = 4;
		if(yearselection < 2016  || yearselection > 2019) {
			throw new IllegalArgumentException("The year must be between 2016 and 2019");
		}
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/ul/li["+ selection +"]/a"));
	}
	
	// -------------- Import Batch pop up --------------
	
	public WebElement importBatch() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a"));
	}
	
	public WebElement exitImportBatch() {
		return driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[1]/button/span"));
	}
		
	public WebElement submitImportBatch() {
		return driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[3]/input"));
	}
	
	public WebElement closeImportBatch() {
		return driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[3]/button"));
	}
	
	
	// -------------- Create New Batch pop up --------------
	
	public WebElement createNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]/a"));
	}
	
	public WebElement saveCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/input"));
	}
	
	public WebElement closeCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/button"));
	}
	
	public WebElement exitCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[1]/button/span"));
	}
	
	// importId
	// trainingName, trainingType, goodGrade, borderlineGrade
	public WebElement getWebElementWithId(String Id) {
		return driver.findElement(By.xpath("//*[@id=\""+ Id +"\"]")); 
	}
	
	//
	public void getDropdownSelection(String elementId, String selection) {
		WebElement mySelectElement = driver.findElement(By.xpath("//*[@id=\"" + elementId + "\"]"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText(selection);		
	}
	
	// start-date, end-date
	public WebElement getDateElement(String startdate_enddate) {
		return driver.findElement(By.xpath("//*[@id=\""+ startdate_enddate +"\"]/input"));
	}
	// start-date, end-date
	public WebElement getDateIcon(String startdate_enddate) {
		return driver.findElement(By.xpath("//*[@id=\""+ startdate_enddate +"\"]/span"));
	}
	
	// 11: insert adds a new trainee, 12: updates the batch info, 13: deletes the batch 
	public WebElement changeBatch(String crudOperation) {
		int selection = 0;
		if(crudOperation.equals("insert")) {
			selection = 11;
		}
		if(crudOperation.equals("update")) {
			selection = 12;
		}
		if(crudOperation.equals("delete")) {
			selection = 13;
		}
		
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr/td[" + selection + "]/a"));
	}
	// ------------ Trainee Screen ------------
	public WebElement getTraineeScreenTitle() {
		return driver.findElement(By.xpath("//*[@id=\\\"addTraineeModal\\\"]/div/div/div[2]/h3"));
	}
	
	public WebElement exitTraineeScreen() {
		return driver.findElement(By.xpath("//*[@id=\"addTraineeModal\"]/div/div/div[1]/button"));
	}
	
	public WebElement closeTraineeScreen() {
		return driver.findElement(By.xpath("//*[@id=\"addTraineeModal\"]/div/div/div[2]/div[2]/button[1]"));
	}
	
	public WebElement saveTraineeScreen() {
		return driver.findElement(By.xpath("//*[@id=\"addTraineeModal\"]/div/div/div[2]/div[2]/input[1]"));
	}
	
	
	
	
}






