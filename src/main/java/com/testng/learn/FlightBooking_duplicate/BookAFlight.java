package com.testng.learn.FlightBooking_duplicate;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;
public class BookAFlight {
	WebDriver driver=null;
		By txtPFirstName= By.name("passFirst0");
		By txtPLastName=By.name("passLast0");
		By drpPMeal= By.name("pass.0.meal");
		By drpCCType= By.name("creditCard");
		By txtCCNumber= By.name("creditnumber");
		By drpCCExpirationdate = By.name("cc_exp_dt_mn");
		By drpCCExpirationmon= By.name("cc_exp_dt_yr");
		By txtCCFirstName= By.name("cc_frst_name");
		By txtCCMiddleName= By.name("cc_mid_name");
		By txtCCLastName= By.name("cc_last_name");
		By txtBA_Address1= By.name("billAddress1");
		By txtBA_Address2= By.name("billAddress2");
		By txtBA_City= By.name("billCity");
		By txtBA_State= By.name("billState");
		By txtBA_PostalCode=By.name("billZip");
		By drpBA_Country=By.name("billCountry");
		By chksame_address=By.xpath("//font[contains(text(),'Same as Billing Address')]//preceding::input[1]");
		By btnbook_flight= By.name("buyFlights");
		BookAFlight(WebDriver driver)
		{
			this.driver=driver;
		}
		@FindBys(
				@FindBy(xpath="//li/a[@class='document_icon']/..//li/a[text()='Checklist']/../ul/li/a")
				)
		List<WebElement> dinesh;
		 void bookflight(HashMap<String,String> bookinguserdetails)
		 {
			 System.out.println("\nEntered into book a flight method");
			 driver.findElement(txtPFirstName).sendKeys(bookinguserdetails.get("FName"));
			 driver.findElement(txtPLastName).sendKeys(bookinguserdetails.get("LName"));
			 
			 WebElement meal=driver.findElement(drpPMeal);
			 Select usermeal=new Select(meal);
			 usermeal.selectByVisibleText(bookinguserdetails.get("Meal"));
	
			 WebElement ctype=driver.findElement(drpCCType);
			 Select cctype=new Select(ctype);
			 cctype.selectByVisibleText(bookinguserdetails.get("cardtype"));
	
			 driver.findElement(txtCCNumber).sendKeys(bookinguserdetails.get("cardnumber"));
			 
			 WebElement wcarddate=driver.findElement(drpCCExpirationdate);
			 Select scarddate=new Select(wcarddate);
			 scarddate.selectByVisibleText(bookinguserdetails.get("expirationdate"));
			 
			 WebElement wcardmon=driver.findElement(drpCCExpirationmon);
			 Select scardmon=new Select(wcardmon);
			 scardmon.selectByVisibleText(bookinguserdetails.get("expirationmon"));
			 
			 driver.findElement(txtCCFirstName).sendKeys(bookinguserdetails.get("CCFName"));
			 driver.findElement(txtCCMiddleName).sendKeys(bookinguserdetails.get("CCMName"));
			 driver.findElement(txtCCLastName).sendKeys(bookinguserdetails.get("CCLName"));
			 driver.findElement(txtBA_Address1).sendKeys(bookinguserdetails.get("Address1"));
			 driver.findElement(txtBA_Address2).sendKeys(bookinguserdetails.get("Address2"));
			 driver.findElement(txtBA_City).sendKeys(bookinguserdetails.get("city"));
			 driver.findElement(txtBA_State).sendKeys(bookinguserdetails.get("state"));
			 driver.findElement(txtBA_PostalCode).sendKeys(bookinguserdetails.get("city"));
			 driver.findElement(txtBA_City).sendKeys(bookinguserdetails.get("postcode"));
			 WebElement WBAcountry=driver.findElement(drpBA_Country);
			 Select SBACountry=new Select(WBAcountry);
			 SBACountry.selectByVisibleText(bookinguserdetails.get("country"));
			 driver.findElement(chksame_address).click();
			 driver.findElement(btnbook_flight).click();
			 
		 }
}
