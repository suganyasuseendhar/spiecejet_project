package com.spiecejet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.spiecejet.utils.BaseTest;

public class SignUpPage extends BaseTest{

	@FindBy (xpath="//select[@class='form-control form-select ']")
	WebElement dropDown;
	
	public void clickSelect() {
		
		waitForElement(dropDown);
		selectDDByIndex(dropDown, 2);
		clickAction(dropDown);
		
		
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	public void enterFirstName(String fname) {
		waitForElement(firstName);
		jsScrollUpToElement(firstName);
		typeText(firstName, fname );
	}
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;
	
	public void enterLastName(String lname) {
		waitForElement(lastName);
		jsScrollUpToElement(lastName);
		typeText(lastName, lname );
	}
	
	
	@FindBy (xpath="//select[@class='form-control form-select'][@tabindex='0']")
	WebElement selectCountry;
	
	public void clickcountry() {
		
		waitForElement(selectCountry);
		selectDDByVisibleText(selectCountry, "India");
		clickAction(selectCountry);
		
		
	}
	
	@FindBy (xpath="//input[@id='dobDate']")
	WebElement dateOfBirth;
	
	public void dobClick() {
	waitForElement(dateOfBirth);
	clickAction(dateOfBirth);
	
	
	}
	
	@FindBy (xpath="//select[@class='react-datepicker__month-select']")
	WebElement selectMonth;
	
	public void clickMonth(String month) {
		
		waitForElement(selectMonth);
		selectDDByVisibleText(selectMonth, month);
		clickAction(selectMonth);
		
		
	}
	@FindBy (xpath="//select[@class='react-datepicker__year-select']")
	WebElement selectYear;
	
	public void clickYear(String year) {
		
		waitForElement(selectYear);
		selectDDByVisibleText(selectYear, year);
		clickAction(selectYear);
		
		
	}
	
	@FindBy(xpath="//div[text()='15']")
	WebElement selectDay;
	
	
	public void clickDate(String day) {
		
		//WebElement selectDay = driver.findElement(By.xpath("(//div[text()="+ day +")]"));
		waitForElement(selectDay);
		//exactDate(selectDay, day);
		clickAction(selectDay);
		
		
		
	}
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement number;
	
	public void enterPhoneNumber(String no) {
		waitForElement(number);
		typeText(number, no );
	}
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	public void enterEmail(String text) {
		waitForElement(email);
		typeText(email, text );
	}
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	public void enterPassword(String pass) {
		waitForElement(password);
		typeText(password, pass );
	}
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement cPassword;
	
	public void enterCPassword(String cpass) {
		waitForElement(cPassword);
		typeText(cPassword, cpass );
	}
	
	
	@FindBy(xpath="//input[@id='defaultCheck1']")
	WebElement click;
	
	public void agreeClick() {
		waitForElement(click);
		jsScrollUpToElement(click);
		jsClick(click);
		
		//clickAction(click);
	}
	
	
	@FindBy(xpath="//button[@type='button'][@class='btn btn-red']")
	WebElement submit;
	
	public void redButtonClick() {
		waitForElement(submit);
		clickAction(submit);
		
		jsScrollUpToElement(submit);
		//jsClick(submit);
	}
	
	
}



