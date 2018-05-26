package com.revature.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageBatch extends POM{


	public ManageBatch(WebDriver driver) {
		super(driver);
	}	
	
//	public WebElement fluentWait(final By locator) {
//	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//	            .withTimeout(30, TimeUnit.SECONDS)
//	            .pollingEvery(5, TimeUnit.SECONDS)
//	            .ignoring(NoSuchElementException.class);
//
//	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//	        public WebElement apply(WebDriver driver) {
//	            return driver.findElement(locator);
//	        }
//	    });
//
//	    return  foo;
//	};
	
	public void createNewBatch() {
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]")).click();
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
	
	public WebElement getIdSelector(String locator) {
		return driver.findElement(By.xpath("//*[@id=\""+ locator + "\"]"));
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






