package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiecejet.utils.BaseTest;

public class FlightStatusPage extends BaseTest {

	@FindBy(xpath = "(//div[contains(text(),'flight status')])[1]")
	WebElement flightStatus;

	public void clickFlightStatus() {
		waitForElement(flightStatus);
		clickAction(flightStatus);

	}

	@FindBy(xpath = "//div[text()='Departure Date']")
	WebElement depatureDate;

	public void clickDepatureDate(String depature) {
		waitForElement(depatureDate);
		selectDDByVisibleText(depatureDate, depature);
		clickAction(depatureDate);

	}

	@FindBy(xpath = "//div[text()='Today']")
	WebElement today;

	public void clickToday() {
		waitForElement(today);
		clickAction(today);
	}

	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;

	public void start(String city) {
		typeText(from, city);
	}

	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;

	public void end(String city) {
		typeText(to, city);
	}

	@FindBy(xpath = "//div[text()='Search Flights']")
	WebElement search;

	public void clickSearchButton() {
		waitForElement(search);
		actionClick(search);
	}

}
