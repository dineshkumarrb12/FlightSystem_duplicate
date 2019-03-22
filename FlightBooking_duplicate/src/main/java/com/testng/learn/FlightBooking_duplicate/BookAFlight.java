package com.testng.learn.FlightBooking_duplicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookAFlight {

	
		By txtPFirstName= By.name("passFirst0");
		By txtPLastName=By.name("passLast0");
		By drpPMeal= By.name("pass.0.meal");
		By drpCCType= By.name("creditCard");
		By txtCCNumber= By.name("creditnumber");
		By drpCCExpiration = By.name("cc_exp_dt_mn");
		By txtCCFirstName= By.name("cc_exp_dt_yr");
		By txtCCMiddleName= By.name("cc_mid_name");
		By txtCCLastName= By.name("cc_last_name");
		By txtBA_Address1= By.name("billAddress1");
		By txtBA_Address2= By.name("billAddress2");
		By txtBA_City= By.name("billCity");
		By txtBA_State= By.name("billState");
		By txtBA_PostalCode=By.name("billZip");
		By drpBA_Country=By.name("billCountry");
		By same_address=By.xpath("//tr[@bgcolor='#CCCCCD']//input[@type='checkbox']");
		BookAFlight(WebDriver driver)
		{
			
		}
		
		
	
}
