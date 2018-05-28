package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
	
	
	
	// Gets a valid dropdown selection from any given dropdown menu
	// input => what the selection should be from the dropdown
	// locator => the name of the dropdown options 
//	public void dropdownSelection(String input, String locator) {
//		List<WebElement> listOfElements = driver.findElements(By.xpath("//select[@name='" + locator + "']/option"));
//		Select select = new Select(driver.findElement(By.name(locator)));
//		
//		for(WebElement el : listOfElements) {
//			if(el.getText().equals(input)) {
//				select.selectByVisibleText(input);
//				return;
//			}
//		}
//		throw new IllegalArgumentException(select + " is not a valid selection");
//	}
	
	
	
	// creates a fluent wait
	// has to be tweaked before it can work
//	public WebElement fluentWait(final By locator) {
//    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//            .withTimeout(30, TimeUnit.SECONDS)
//            .pollingEvery(5, TimeUnit.SECONDS)
//            .ignoring(NoSuchElementException.class);
//
//    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//        public WebElement apply(WebDriver driver) {
//            return driver.findElement(locator);
//        }
//    });
//
//    return  foo;
//};
	
	
}