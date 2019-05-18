package com.testng.learn.utilitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSupplices {
	public WebDriver driversetup ()
	{	WebDriver driver=null;
		String path=null;
		path=System.getProperty("user.dir");
		path=path+"/src/test/sources/chromedriver.exe";
		System.out.println("path is "+path);
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryreservation.php");
		return driver;
	}
}
