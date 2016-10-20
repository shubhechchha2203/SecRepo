package com.project.selenium.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.project.selenium.page.IRCTCflightBookingPage;
import com.project.selenium.page.IRCTCloginPage;

public class IRCTCloginTest {
	
	@Test
	public void testMethod()
	{
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();  //command to maximize the window
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		 IRCTCloginPage lp=new IRCTCloginPage(driver);
		 lp.clickOnFlight();
		 
		 
		 String pw=driver.getWindowHandle();//command to switch window
		 Set<String> allwin=driver.getWindowHandles();
		 for(String s:allwin)
		 {
			if(s.equals(pw)== false)
			{
					driver.switchTo().window(s);
					break;
			}
					
		 }
			
		 IRCTCflightBookingPage fb= new IRCTCflightBookingPage(driver);
		 fb.enter_source();
		 fb.selectSrcValue();
		 fb.enter_destination();
		 fb.selectDestValue();
		 fb.dateSelection();
		 fb.dateValue();
		 fb.adultSelection();
		 fb.childSelection();
		 fb.searchFlight();
		 fb.totalFlight();
		 
		 driver.close();
		 driver.switchTo().window(pw);
		 driver.close();
		 
		
	}

}
