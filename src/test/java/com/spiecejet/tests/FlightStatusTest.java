package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.spiecejet.pages.FlightStatusPage;
import com.spiecejet.utils.BaseTest;
import com.spiecejet.utils.Reports;

@Listeners(Reports.class)
public class FlightStatusTest extends BaseTest{

	
	Reports report = new Reports();

	@Test(priority = 6)
	
	public void flightStatus() {

		try {

			report.setTCDesc("Validate Flight Status in SpiceJet website");
			//launchBrowser("https://www.spicejet.com/");

			FlightStatusPage status = PageFactory.initElements(driver, FlightStatusPage.class);
			
			status.clickFlightStatus();
			status.clickDepatureDate("tomarrow");
			status.clickToday();
			status.start("chen");
			status.end("del");
			status.clickSearchButton();
			validateTitle("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
			System.out.println("Flight status Fields Verified successfully");
			closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
