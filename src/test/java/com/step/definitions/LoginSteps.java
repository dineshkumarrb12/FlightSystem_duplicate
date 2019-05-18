package com.step.definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testng.learn.FlightBooking_duplicate.FlightLogin;
import com.testng.learn.utilitest.DriverSupplier;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private WebDriver driver;
	
	@Given("Launch the application")
	public void launchApplication() {
		DriverSupplier supplier=new DriverSupplier();
		driver=supplier.driversetup();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,600);
	}
	
	@When("sign-in with username as {string} and password as {string}")
	public void enterUserNamePassword(String user, String password) {
		FlightLogin logins=new FlightLogin(driver);
		logins.login(user, password);
	}
	
	@Then("application should redirect to home page")
	public void shouldDisplayHomePage() {
		// TODO create a function to check if FlightFinder page is displayed
	}
	
	@Then("application should show wrong username alert")
	public void displayWrongUsername() {
		// TODO create a function to check if wrong username alert displayed
	}

}
