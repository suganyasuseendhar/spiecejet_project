package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.spiecejet.utils.Reports;
import com.spiecejet.pages.EbookingValidationPage;
@Listeners(Reports.class)


public class EbookingValidationTest extends EbookingValidationPage{
	Reports report = new Reports();
	@Test(priority = 7)	
	
public void validateCheckIn() {
		
		try {
			report.setTCDesc("Validate Manage Booking in SpiceJet website");

		//launchBrowser("https://www.spicejet.com");
		//driver.get("https://www.spicejet.com");
			
			EbookingValidationPage mvp = PageFactory.initElements(driver, EbookingValidationPage.class);
			mvp.clickManageBookingElement();
			mvp.enterGeneratedTicketNumber("B458YU");
			mvp.enterLastNmae("Suseendhar");
			mvp.clickSearchButton();
			mvp.validateCheckingProcess("Unable to fetch your booking. Please check the inputs \n"
					+ " you have provided and try again.");
			System.out.println(" EBookings Fields Verified successfully");
			closeBrowser();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
