package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiecejet.utils.BaseTest;

public class EbookingValidationPage extends BaseTest {

	@FindBy(xpath="//div[text()='manage booking']")
	WebElement booked;
	
	public void clickManageBookingElement() {
		clickAction(booked);
	}
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	WebElement ticketGenerated;
	
	public void enterGeneratedTicketNumber(String num) {
		waitForElement(ticketGenerated);
		typeText(ticketGenerated, num);
	}
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	WebElement Bookinglname;
	
	public void enterLastNmae(String name) {
		waitForElement(Bookinglname);
		typeText(Bookinglname, name);
	}
	
	@FindBy(xpath="//div[text()='Search Booking']")
	WebElement searchBooking;
	
	public void clickSearchButton() {
		waitForElement(searchBooking);
	//	clickAction(search);
	//	jsClick(search);
		actionClick(searchBooking);
		
	}
	
	@FindBy(xpath="//div[@class='css-76zvg2 css-cens5h r-jwli3a']")
	WebElement buttonUnable;
	
	public void validateCheckingProcess(String text) {
		waitForElement(buttonUnable);
		System.out.println(buttonUnable.getText());
		validateText(buttonUnable, text);
	}
	
}
