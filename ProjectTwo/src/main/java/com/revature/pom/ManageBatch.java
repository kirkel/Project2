package com.revature.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageBatch extends POM{


	public ManageBatch(WebDriver driver) {
		super(driver);
	}	
	
	public void createNewBatch() {
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]/a")).click();
	}
	
	public void importBatch() {
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a")).click();
	}
	
	// -------------- Import Batch pop up --------------
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
	
	public WebElement exitCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[1]/button"));
	}
	
	public WebElement getTrainingName(){
		return driver.findElement(By.xpath("//*[@id=\"trainingName\"]"));
	}
	
	public WebElement getTrainingType(){
		return driver.findElement(By.xpath("//*[@id=\"trainingType\"]"));
	}
	
	public WebElement getSkillType(){
		return driver.findElement(By.xpath("//*[@id=\"skillType\"]"));
	}
	
	public WebElement getLocation(){
		return driver.findElement(By.xpath("//*[@id=\"location\"]"));
	}
	
	public WebElement getTrainer(){
		return driver.findElement(By.xpath("//*[@id=\"trainer\"]"));
	}
	
	public WebElement getCoTrainer(){
		return driver.findElement(By.xpath("//*[@id=\"co-trainer\"]"));
	}

	public WebElement getStartDateInput(){
		return driver.findElement(By.xpath("//*[@id=\"start-date\"]/input"));
	}
	
	public WebElement getStartDateIcon(){
		return driver.findElement(By.xpath("//*[@id=\"start-date\"]/span"));
	}
	
	public WebElement getEndDateInput() {
		return driver.findElement(By.xpath("//*[@id=\"end-date\"]/input"));
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
	
	public WebElement saveCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/input"));
	}
	
	public WebElement closeCreateNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/button"));
	}
	
	

	
}






