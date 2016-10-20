package com.project.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IRCTCloginPage {
	
	WebDriver driver;
	public IRCTCloginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By flight=By.xpath("//a[@href='http://air.irctc.co.in']");
	public void clickOnFlight()
	{
		driver.findElement(flight).click();
	}

}
