package com.revature.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ManageBatch extends POM{


	public ManageBatch(WebDriver driver) {
		super(driver);
	}	
	
	public void getYearSelection(String year) {
		int yearselection = Integer.parseInt(year);
		
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/a")).click();
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[1]/a")));
		
		int selection = 0;
		if(yearselection == 2019)
			selection = 1;
		if(yearselection == 2018)
			selection = 2;
		if(yearselection == 2017)
			selection = 3;
		if(yearselection == 2016)
			selection = 4;
		
		dropdown.selectByIndex(selection);	
		
	}
	
		
	// -------------- Import Batch pop up --------------
	
	public void importBatch() {
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a")).click();
	}
	
	public void exitImportBatch() {
		driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[1]/button/span")).click();
	}
		
	public void submitImportBatch() {
		driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[3]/input")).click();
	}
	
	public void closeImportBatch() {
		driver.findElement(By.xpath("//*[@id=\"importBatchModal\"]/div/div/div[3]/button")).click();
	}
	
	public void getImportBatchDropdown() {
		driver.findElement(By.xpath("//*[@id=\"importId\"]")).click();
	}
	
	
	// -------------- Create New Batch pop up --------------
	
	public void createNewBatch() {
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]/a")).click();
	}
	
	public void exitCreateNewBatch() {
		driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[1]/button/span")).click();
	}
	
	public void getTrainingName(String name){
		driver.findElement(By.xpath("//*[@id=\"trainingName\"]")).sendKeys(name);
	}
	
	public void getDropdownSelection(String elementId, String selection) {
		WebElement mySelectElement = driver.findElement(By.xpath("//*[@id=\"" + elementId + "\"]"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText(selection);		
	}
	

	public void getStartDateInput(String date){
		driver.findElement(By.xpath("//*[@id=\"start-date\"]/input")).sendKeys(date);
	}
	
	public WebElement getStartDateIcon(){
		return driver.findElement(By.xpath("//*[@id=\"start-date\"]/span"));
	}
	
	public void getEndDateInput(String date) {
		driver.findElement(By.xpath("//*[@id=\"end-date\"]/input")).sendKeys(date);
	}
	
	public WebElement getEndDateIcon() {
		return driver.findElement(By.xpath("//*[@id=\"end-date\"]/span"));
	}
	
	public WebElement getGoodGrade(){
		return driver.findElement(By.xpath("//*[@id=\"goodGrade\"]"));
	}
	
	public WebElement getPassingGrade(){
		return driver.findElement(By.xpath("//*[@id=\"borderlineGrade\"]"));
	}
	
	public void saveCreateNewBatch() {
		driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/input")).click();
	}
	
	public void closeCreateNewBatch() {
		driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/button")).click();
	}
	
	

	
}






