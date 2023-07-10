package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.spiecejet.utils.Reports;
import com.spiecejet.pages.LoginPage;
import com.spiecejet.pages.SignUpPage;
@Listeners(Reports.class)
public class LoginTest extends LoginPage {

	Reports report = new Reports();
	@Test(priority = 1)
	public void log() {

		try {
			report.setTCDesc("Validate Positive Login functionality");
			//launchBrowser("https://www.spicejet.com/");

			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			login.clickLogin();
			login.clickEmail();
			login.typeEmail("suganit37@gmail.com");
			login.enterCode("GSugan@1234");
			login.clickLoginbutton();
			validateTitle("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
			System.out.println("Positive Login functionality has been verified successfully");
			closeBrowser();
		} catch (Exception e) {

			System.out.println("Problem while signin your account");
			e.printStackTrace();
		}

	}
}