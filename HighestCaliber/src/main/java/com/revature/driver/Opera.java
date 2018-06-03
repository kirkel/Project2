package com.revature.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;

public class Opera implements MyDriver{

	@Override
	public WebDriver getDriver() {
		File file = new File("src/main/resources/operadriver.exe");
		System.setProperty("webdriver.opera.driver", file.getAbsolutePath());
		return new OperaDriver();
	}

}
