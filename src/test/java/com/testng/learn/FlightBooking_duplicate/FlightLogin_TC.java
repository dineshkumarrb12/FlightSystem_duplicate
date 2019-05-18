package com.testng.learn.FlightBooking_duplicate;

import org.openqa.selenium.WebDriver;

import com.testng.learn.utilitest.DriverSupplier;

public class FlightLogin_TC {
	public WebDriver login()
	{
		DriverSupplier supplier=new DriverSupplier();
		WebDriver driver=supplier.driversetup();
		FlightLogin logins=new FlightLogin(driver);
		logins.login("dineshkumartest", "dineshtest");
		return driver;
	}
}
