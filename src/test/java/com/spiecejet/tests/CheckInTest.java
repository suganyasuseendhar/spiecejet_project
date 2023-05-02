package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spiecejet.pages.CheckInPage;
import com.spiecejet.pages.SignUpPage;

public class CheckInTest extends CheckInPage {

	@Test
	public void checkIn () {

		try {

			launchBrowser("https://www.spicejet.com/");

			CheckInPage check = PageFactory.initElements(driver, CheckInPage.class);
			
			check.clickCheckIn();
			check.enterticketNumber("W3DF34");
			check.enterLastMailId("suganit37@gmail.com");
			check.clickSearchBooking();
			
}
		catch (Exception e) {

			System.out.println("Problem while check - in your account");
			e.printStackTrace();
		}
	}

}