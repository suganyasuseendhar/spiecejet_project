package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiecejet.utils.BaseTest;

public class FlightSearchContinue extends BaseTest{
	
	
	@FindBy(xpath = "(//div[text()='Continue'])[1]")
	WebElement continue1;

	public void clickContinueButton() {
		waitForElement(continue1);
		// clickAction(continue1);
		// jsClick(continue1);
		actionClick(continue1);
	}

	
	
	
	
}


