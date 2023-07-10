package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.spiecejet.utils.BaseTest;

public class OneWayTripPage extends BaseTest {

	@FindBy(xpath = "//div[text()='one way']")
	WebElement oneWay;

	public void singleDirection() {

		waitForElement(oneWay);
		clickAction(oneWay);
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement departureDate;

	public void onLocation(String nameOfLocation) {

		waitForElement(departureDate);
		typeText(departureDate, nameOfLocation );
	}
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement returnDate;

	public void endLoca(String nameOfEndLocation) {
		
		waitForElement(returnDate);
		typeText(returnDate, nameOfEndLocation );
	}
	
	@FindBy(xpath = "(//div[text()='Departure Date']")
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
	
	@FindBy(xpath = "(//div[text()='10'])[3]")
	WebElement clickParticularDate;

	public void selectParticularCalender() {
		
		waitForElement(clickParticularDate);
		clickAction(clickParticularDate);
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
