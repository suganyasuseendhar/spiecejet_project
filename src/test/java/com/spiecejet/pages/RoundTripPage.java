package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiecejet.utils.BaseTest;

public class RoundTripPage extends BaseTest{
	@FindBy(xpath="//div[text()='round trip']")
	WebElement round;
	
	public void clickRoundTrip() {
		clickAction(round);
	}

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement from;
	
	public void typeFrom(String text) {
		typeText(from, text);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement to;
	
	public void typeTo(String text) {
		typeText(to, text);
	}
	
	@FindBy(xpath="(//div[text()='15'])[4]")
	WebElement day;
	
	public void clickDate() {
		waitForElement(day);
		clickAction(day);
	}
	
	@FindBy(xpath="(//div[text()='20'])[4]")
	WebElement returnDate;
	
	public void clickReturndate() {
		waitForElement(returnDate);
		clickAction(returnDate);
	}
	
	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement search;
	
	public void clickSearchFlight() {
		waitForElement(search);
		//clickAction(search);
	//	jsClick(search);
		actionClick(search);
	}
}

	/*@FindBy(xpath = "//div[text()='round trip']")
	WebElement roundTrip;

	public void round() {

		waitForElement(roundTrip);
		clickAction(roundTrip);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement departureDate;

	public void onLocation(String nameOfLocation) {

		waitForElement(departureDate);
		typeText(departureDate, nameOfLocation );
	}
	
	
	/*@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement returnDate;

	public void onLocation1(String lastLocation) {
		
		waitForElement(returnDate);
		typeText(returnDate, lastLocation );
	}
	*/
	/*@FindBy(xpath = "(//div[text()='Departure Date']")
	WebElement calenderDate;

	public void clickCalender() {
		
		waitForElement(calenderDate);
		clickAction(calenderDate);
	}
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1niwhzg r-z2wwpe r-17b9qp5 r-1g94qm0 r-h3f8nf r-u8s1d r-u3yave r-8fdsdq']")
	WebElement clickDate;

	public void selectCalender() {
		
		waitForElement(clickDate);
		clickAction(clickDate);
	}
	
	@FindBy(xpath = "(//div[text()='14'])[3]")
	WebElement clickParticularDate;

	public void selectParticularCalender() {
		
		waitForElement(clickParticularDate);
		clickAction(clickParticularDate);
	}
	
	@FindBy(xpath = "(//div[text()='14'])[5]")
	WebElement clickParticularEndDate;

	public void selectEndCalender() {
		
		waitForElement(clickParticularEndDate);
		clickAction(clickParticularEndDate);
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement returnDate;
	public void onLocation1 (String lastLocation){
		
		waitForElement(returnDate);
		typeText(returnDate, lastLocation );
	}
	
	
	@FindBy  (xpath = "//div[text()='Currency']")
	WebElement currency;


	public void selectCurrency(String curr) {

		waitForElement(currency);
		clickAction(currency);
		selectDDByVisibleText(currency, curr);
	}


	@FindBy  (xpath = "//div[text()='Family & Friends']")
	WebElement familyFriends;


	public void selectfamilyFriends(String family) {

		waitForElement(familyFriends);
		clickAction(familyFriends);
		//selectDDByVisibleText(currency, curr);
	}
	
	*/
	
	












