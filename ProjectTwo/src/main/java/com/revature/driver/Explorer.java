package com.revature.driver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Explorer implements MyDriver{

	@Override
	public WebDriver getDriver() {
		File file = new File("src/main/resources/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		return new InternetExplorerDriver();
	}

}
