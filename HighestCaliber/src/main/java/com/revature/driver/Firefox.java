package com.revature.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Firefox implements MyDriver {

    @Override
    public WebDriver getDriver() {
        File file = new File("src/main/resources/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
        return new FirefoxDriver();
    }

}
