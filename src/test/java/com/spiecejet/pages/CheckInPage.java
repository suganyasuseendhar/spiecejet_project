package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiecejet.utils.BaseTest;

public class CheckInPage extends BaseTest{
	

	@FindBy(xpath="//div[text()='check-in']")
	WebElement check;
	
	
	public void clickCheckIn() {
		
		waitForElement(check);
		clickAction(check);
		
		
	}
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement ticketNumber;
	
	
	public void enterticketNumber(String pnrNo) {
		
		waitForElement(ticketNumber);
		typeText(ticketNumber, pnrNo);
		
		
	}
	
	/*@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement mailID;
	
	
	public void enterLastMailId(String email) {
		
		waitForElement(mailID);
		typeText(mailID, email);
		
		
	}
	
	
	
	@FindBy(xpath="//div[contains(text(),'Search Booking')]")
	WebElement searchBooking;
	
	
	public void clickSearchBooking() {
		
		waitForElement(searchBooking);
		//clickAction(searchBooking);
		jsClick(searchBooking);
		
	}
	
}*/
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	WebElement lname;
	
	public void enterLastNmae(String name) {
		waitForElement(lname);
		typeText(lname, name);
	}
	
	@FindBy(xpath="//div[text()='Search Booking']")
	WebElement search;
	
	public void clickSearch() {
		waitForElement(search);
	//	clickAction(search);
	//	jsClick(search);
		actionClick(search);
		
	}
	
	@FindBy(xpath="//div[@class='css-76zvg2 css-cens5h r-jwli3a']")
	WebElement unable;
	
	public void validateCheckingField(String text) {
		waitForElement(unable);
		System.out.println(unable.getText());
		validateText(unable, text);
	}

}
