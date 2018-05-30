package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM {
	
	public WebDriver driver; 
	private static final String URL = "https://dev-caliber.revature.tech/";
	
	// Note: the boolean only exists so you can have 2 constructors by passing in a driver
	// this is needed so the POM doesn't refresh the page every time whenever it is called to be constructed by subclasses 
	// hacky workaround, but hey, it works
	public POM(WebDriver driver, boolean createDriverForFirstTime) {
		this.driver = driver;
		if(createDriverForFirstTime)
			driver.get(URL);
	}
	public POM(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	// -------------- Header --------------
	
	public WebElement getLogoButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[1]/li/a"));
	}
	
	// 1: home button, 2: managebatch, 3: assessbatch, 4: reports
	public WebElement getNavbarElements(String navElement) {
		int selection = 0;
		if(navElement.equals("home")) {
			selection = 1;
		}
		if(navElement.equals("manageBatch")) {
			selection = 2;
		}
		if(navElement.equals("assessBatch")) {
			selection = 3;
		}
		if(navElement.equals("reports")) {
			selection = 4;
		}
		if(selection == 0) {
			throw new IllegalArgumentException("That is not an element defined on the navbar");
		}
		
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li["+ selection +"]/a"));
	}
	
	
	// -------------- Footer --------------

	// 1: phonenumber, 2: email, 3: revature
	public WebElement getFooterLink(String footerSelection) {
		int selection = 0;
		if(footerSelection.equals("phonenumber")) {
			selection = 1;
		}
		if(footerSelection.equals("email")) {
			selection = 2;
		}
		if(footerSelection.equals("revature")) {
			selection = 3;
		}
		if(selection == 0) {
			throw new IllegalArgumentException("That is not an element defined in the footer");
		}
		
		return driver.findElement(By.xpath("/html/body/footer/div/div/div/div[2]/a[" + selection + "]"));
	}
}
