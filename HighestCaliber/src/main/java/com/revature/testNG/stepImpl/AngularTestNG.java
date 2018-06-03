package com.revature.testNG.stepImpl;

import com.revature.driver.DriverFactory;
import com.revature.pom.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class AngularTestNG {
    WebDriver driver;
    HomePage homePage;

    @When("^a user opens a web browser$")
    public void a_user_opens_a_web_browser() throws Throwable {
        driver = DriverFactory.getDriver("chrome");
    }

    @When("^a user navigates to Caliber website$")
    public void a_user_navigates_to_Caliber_website() throws Throwable {
        homePage = new HomePage(driver);
    }

    @Then("^the user should see the Caliber home page$")
    public void the_user_should_see_the_Caliber_home_page() throws Throwable {
        assertEquals("Caliber | Performance Management", homePage.getPageTitle());
        Thread.sleep(3000);
    }

    @After
    public void shutDownDrivers() {
        driver.quit();
    }


}
