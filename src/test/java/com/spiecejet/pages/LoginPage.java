package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiecejet.utils.BaseTest;

public class LoginPage extends BaseTest{
	
	@FindBy(xpath="//span[@class=\"d-none d-lg-block\"]")
	WebElement login;
	
	public void clickLogin() {
		
		waitForElement(login);
		clickAction(login );
		
	}
	
	
	
	@FindBy(xpath="//div(text()='Email')")
	WebElement email;
	
	public void clickEmail() {
		
		waitForElement(email);
		clickAction(email );
		
		
		
	}
	
	
	@FindBy(xpath="(//input[@type='email']")
	WebElement enterEmail;
	
	public void typeEmail(String gmail) {
		
		waitForElement(enterEmail);
		typeText(enterEmail, gmail );
		
		
		
	}
	
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterpassword;
	
public void enterCode(String psw) {
		
		waitForElement(enterpassword);
		typeText(enterpassword, psw );
		
		
		
	}

@FindBy(xpath="//div[@class='btn btn-red plr-50']")
WebElement loginRed;

public void clickLoginButton() {
	
	waitForElement(loginRed);
	//clickAction(loginRed );
	jsClick(loginRed);
	
}
	
	
	
}
