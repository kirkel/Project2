package com.revature.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public abstract class POM {
	
	protected WebDriver driver; 
	public POM(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	// Gets a valid dropdown selection from any given dropdown menu
	// input => what the selection should be from the dropdwon
	// locator => the name of the dropdown options 
	public void dropdownSelection(String input, String locator) {
		List<WebElement> listOfElements = driver.findElements(By.xpath("//select[@name='" + locator + "']/option"));
		Select select = new Select(driver.findElement(By.name(locator)));
		
		for(WebElement el : listOfElements) {
			if(el.getText().equals(input)) {
				select.selectByVisibleText(input);
				return;
			}
		}
		throw new IllegalArgumentException(select + " is not a valid selection");
	}
	
	// -------------- Header --------------
	
	public void getLogoButton() {
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[1]/li/a")).click();
	}
	
	public void getHomeButton() {
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[1]/a")).click();
	}
	
	public void getManageBatchButton() {
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[2]/a")).click();
	}
	
	public void getAssessBatchButton() {
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[3]/a")).click();
	}
	
	public void getReportsButton() {
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[4]/a")).click();
	}
	
	
	// -------------- Footer --------------
	
	public void getPhoneNumber() {
		driver.findElement(By.xpath("/html/body/footer/div/div/div/div[2]/a[1]")).click();
	}
	
	public void getEmail() {
		driver.findElement(By.xpath("/html/body/footer/div/div/div/div[2]/a[2]")).click();
	}
	
	public void getRevatureLink() {
		driver.findElement(By.xpath("/html/body/footer/div/div/div/div[2]/a[3]")).click();
	}
}
