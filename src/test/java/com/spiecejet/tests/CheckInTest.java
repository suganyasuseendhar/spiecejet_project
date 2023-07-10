package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.spiecejet.pages.CheckInPage;
import com.spiecejet.utils.Reports;
import com.spiecejet.utils.BaseTest;


@Listeners(Reports.class)
public class CheckInTest extends BaseTest {

	Reports report = new Reports();
	@Test(priority = 5)
	
	public void checkIn () {

		try {

			report.setTCDesc("Validate Checkin field in SpiceJet website");
			//launchBrowser("https://www.spicejet.com/");

			CheckInPage check = PageFactory.initElements(driver, CheckInPage.class);
			
			check.clickCheckIn();
			check.enterticketNumber("W3DF34");
			//check.enterLastMailId("suganit37@gmail.com");
			//check.clickSearchBooking();
			check.enterLastNmae("suganya");
			check.clickSearch();
			check.validateCheckingField("Unable to fetch your booking. Please check the inputs \n"
					+ " you have provided and try again.");
			System.out.println("ChechIn Fields Verified successfully");
			closeBrowser();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}