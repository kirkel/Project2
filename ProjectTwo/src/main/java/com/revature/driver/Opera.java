package com.revature.driver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera implements MyDriver{

	@Override
	public WebDriver getDriver() {
		File file = new File("src/main/resources/operadriver.exe");
		System.setProperty("webdriver.opera.driver", file.getAbsolutePath());
		return new OperaDriver();
	}

}
