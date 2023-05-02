package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spiecejet.pages.LoginPage;
import com.spiecejet.pages.SignUpPage;

public class LoginTest extends LoginPage {

	@Test
	public void log() {

		try {

			launchBrowser("https://www.spicejet.com/");

			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.clickLogin();
			login.clickEmail();
			login.typeEmail("suganit37@gmail.com");
			login.enterCode("GSugan@1234");
			login.clickLoginButton();

		} catch (Exception e) {

			System.out.println("Problem while signin your account");
			e.printStackTrace();
		}

	}
}