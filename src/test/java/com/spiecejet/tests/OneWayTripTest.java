package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.spiecejet.pages.FlightSearchContinue;
import com.spiecejet.pages.PaymentPage;
import com.spiecejet.pages.OneWayTripPage;
import com.spiecejet.pages.SignUpPage;
import com.spiecejet.utils.BaseTest;

public class OneWayTripTest extends BaseTest{
	
	private FlightSearchContinue FlightSearchContinue;

	@Test
	public void oneway() {

		try {

			launchBrowser("https://www.spicejet.com/");

			OneWayTripPage oneWay = PageFactory.initElements(driver, OneWayTripPage.class);
			oneWay.singleDirection();
			oneWay.onLocation("chen");
			Thread.sleep(3000);
			oneWay.endLoca("hy");
			oneWay.clickCalender();
			oneWay.selectParticularCalender();
			
			//oneWay.selectCurrency("INR");
			//oneWay.selectfamilyFriends("Family & Friends");
			oneWay.clickSearchFlight();
			
			//FlightSearchContinue cont = PageFactory.initElements(driver, FlightSearchContinue.class);
			
			FlightSearchContinue cont = PageFactory.initElements(driver, FlightSearchContinue.class);
			cont.clickContinueButton();
			System.out.println("Booking page passed successfully in One Way Trip.");
			System.out.println();

			//PaymentPage pay = PageFactory.initElements(driver, PaymentPage.class);
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
		} catch (Exception e) {

			System.out.println("Problem while one way trip");
			e.printStackTrace();
			
			
			
			
		}
	}

}
