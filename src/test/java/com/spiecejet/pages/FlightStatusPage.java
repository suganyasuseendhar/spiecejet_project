package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiecejet.utils.BaseTest;

public class FlightStatusPage extends BaseTest{
	
	
	@FindBy(xpath="(//div[contains(text(),'flight status')])[1]")
	WebElement flightStatus;
	
	
	public void clickFlightStatus() {
		waitForElement(flightStatus);
		clickAction(flightStatus);
		
		
	}
	
	
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement depatureDate;
	
	
	public void clickDepatureDate(String depature) {
		waitForElement(depatureDate);
		selectDDByVisibleText(depatureDate, depature);
		clickAction(depatureDate);
		
		
	}

	
	
}
