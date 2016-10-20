package com.project.selenium.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IRCTCflightBookingPage {

	WebDriver driver;
	public IRCTCflightBookingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	int i;
	private By source=By.xpath("//input[@id='origin']");
	private By destination=By.xpath("//input[@id='destination']");
	private By srcValue=By.xpath("//a[contains(text(),'Delhi')]");
	private By destValue=By.xpath("//a[contains(text(),'Bombay')]");
	private By dateSelect=By.xpath("//input[@id='departDate']/following-sibling::img");
	private By dateValue=By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[contains(text(),'25')]");
	private By noOfAdult=By.xpath("//select[@id='noOfAdult']");
	private By noOfChild=By.xpath("//select[@id='noOfChild']");
	private By submit=By.xpath("//div[@onclick='submitSearch();']");
	private By listOfFlight=By.xpath("//div[@class='onewayflightinfo']");
	private By totalNoOfFlight=By.xpath("//div[@class='onewayflightinfo']");
	
	public void enter_source()
	{
		driver.findElement(source).sendKeys("Delhi");
	}
	
	public void enter_destination()
	{
		driver.findElement(destination).sendKeys("mumbai");
	}
	
	public void selectSrcValue()
	{
		driver.findElement(srcValue).click();
	}
	
	public void selectDestValue()
	{
		driver.findElement(destValue).click();
	}
	
	public void dateSelection()
	{
		driver.findElement(dateSelect).click();
	}
	
	public void dateValue()
	{
		driver.findElement(dateValue).click();
	}
	
	public void adultSelection()
	{
		driver.findElement(noOfAdult).click();
	}
	
	public void childSelection()
	{
		driver.findElement(noOfChild).click();
	}
	
	public void searchFlight()
	{
		driver.findElement(submit).click();
	}
	
	public void listOfFlight()
	{
		driver.findElement(listOfFlight);
	}
	
	public void totalFlight()
	{
		List<WebElement> alllist= driver.findElements(totalNoOfFlight);//command to create a list of flights
	    System.out.println(alllist.size());
	}
}
