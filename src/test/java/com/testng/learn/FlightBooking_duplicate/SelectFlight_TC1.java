package com.testng.learn.FlightBooking_duplicate;

import org.openqa.selenium.WebDriver;

public class SelectFlight_TC1 {
	public WebDriver selectflight() {
		
		FlightFinder_TC1 selectflight=new FlightFinder_TC1();
		WebDriver driver=selectflight.flightfinder();
	
	SelectFlight flight1=new SelectFlight(driver);
	System.out.println("came to select flight section");
	flight1.select_flight("Unified Airlines 363", "Pangea Airlines 632");
	flight1.book_flight_continue();
	return driver;
}
}