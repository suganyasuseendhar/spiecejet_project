package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.spiecejet.utils.Reports;
import com.spiecejet.pages.FlightSearchContinue;
import com.spiecejet.pages.OneWayTripPage;
import com.spiecejet.pages.PaymentPage;
import com.spiecejet.pages.RoundTripPage;
import com.spiecejet.utils.BaseTest;
@Listeners(Reports.class)
public class RoundTripTest extends BaseTest{

	Reports report = new Reports();

	@Test(priority = 4)
	public void roundTrip() {

		try {
			report.setTCDesc("Search flights for Round trip");
			//launchBrowser("https://www.spicejet.com/");

			RoundTripPage round = PageFactory.initElements(driver, RoundTripPage.class);
			round.clickRoundTrip();
			round.typeFrom("chen");
			Thread.sleep(2000);
			round.typeTo("koc");
			round.clickDate();
			round.clickReturndate();
			Thread.sleep(6000);
			screenShot("RoundTripSearchFlights");
			System.out.println("Round trip flights has been searched successfully.");
			System.out.println();
			
			
			FlightSearchContinue cont = PageFactory.initElements(driver, FlightSearchContinue.class);
			cont.clickContinueButton();
			System.out.println("Booking page passed successfully in One Way Trip.");
			System.out.println();
			
			
			PaymentPage pay = PageFactory.initElements(driver, PaymentPage.class);
			pay.enterFName("suganya");
			pay.enterLName("suseendhar");
			pay.enterPNumber("7358638444");
			pay.enterEmailId("suganit37@gmail.com");
			pay.enterCityName("Chennai");
			pay.clickBox();
			pay.enterFTraveller("suganya");
			pay.enterLNameTraveller("suseendhar");
			pay.enterPNumberTraveller("7358638444");
			pay.clickContinueButton();
			pay.clickContinueButton2();
			pay.clickSkipSeat();
			pay.enterCardNumber("1234567890123456");
			pay.enterAccHolderName("suganya");
			pay.enterExpiryMonth("12");
			pay.enterExpiryYear("25");
			pay.enterExpiryCVV("123");
			pay.framesByDefault();
			pay.clickProceedToPay();
			Thread.sleep(4000);
			screenShot("OneWayTripPaymentInvalid");
			
			pay.validatePayment("Invalid Card Details");
			closeBrowser();
			
		}
			
		catch(Exception e) {
			
		
		
		}
		}
}