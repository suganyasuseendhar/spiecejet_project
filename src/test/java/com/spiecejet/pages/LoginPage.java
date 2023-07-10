package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spiecejet.utils.BaseTest;

public class LoginPage extends BaseTest {

	//@FindBy(xpath = "//span[@class=\"d-none d-lg-block\"]")
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
   public void clickLogin() {

		waitForElement(login);
		clickAction(login);

	}

	@FindBy(xpath = "//div(text()='Email')")
	WebElement email;

	public void clickEmail() {

		waitForElement(email);
		clickAction(email);

	}

	@FindBy(xpath = "(//input[@type='email']")
	WebElement enterEmail;

	public void typeEmail(String gmail) {

		waitForElement(enterEmail);
		typeText(enterEmail, gmail);

	}

	//@FindBy(xpath = "//input[@type='password']")
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement enterpassword;

	public void enterCode(String psw) {

		waitForElement(enterpassword);
		typeText(enterpassword, psw);

	}

	/*@FindBy(xpath = "//div[@class='btn btn-red plr-50']")
	WebElement loginRed;

	public void clickLoginButton() {

		waitForElement(loginRed);
		// clickAction(loginRed );
		jsClick(loginRed);

	}*/

	
	@FindBy(xpath="//div[text()='LOGIN']")
	WebElement enterLogin;
	
	public void clickLoginbutton() {
		waitForElement(enterLogin);
		//clickAction(login1);
		//jsClick(login1);
		actionClick(enterLogin);
	}
	
	
}
