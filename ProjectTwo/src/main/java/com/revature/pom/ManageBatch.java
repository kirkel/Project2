package com.revature.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageBatch extends POM{


	public ManageBatch(WebDriver driver) {
		super(driver);
	}	
	
	public WebElement createNewBatch() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]/a"));
	}
	
	
	
	public WebElement importBatch() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[2]/a"));
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
	

	
	
}






