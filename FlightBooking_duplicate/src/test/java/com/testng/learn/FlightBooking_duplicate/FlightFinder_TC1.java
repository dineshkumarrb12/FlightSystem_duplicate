package com.testng.learn.FlightBooking_duplicate;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testng.learn.flightbooking_duplicate.FlightFinder;
public class FlightFinder_TC1 {
	public WebDriver flightfinder()
	{
		{
			FlightLogin_TC logins=new FlightLogin_TC();
			WebDriver driver=logins.login();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriverWait wait=new WebDriverWait(driver,600); //10 mins
			FlightFinder flightdetails=new FlightFinder(driver);
			HashMap<String,String> flightinput= new HashMap<String,String>();
			flightinput.put("Type", "One Way");
			flightinput.put("passangers", "3");
			flightinput.put("departfrom","London");
			flightinput.put("departmonth", "March");
			flightinput.put("departday", "12");
			flightinput.put("arrivingto", "Portland");
			flightinput.put("arrivingmonth", "February");
			flightinput.put("arrivingday", "27");
			flightdetails.flight_details(flightinput);
			flightdetails.preferences("Business class","Unified Airlines");
			flightdetails.continue_selectflight();
			return driver;
		}
	}
}
