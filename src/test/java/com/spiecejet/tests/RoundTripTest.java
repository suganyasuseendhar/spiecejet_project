package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spiecejet.pages.OneWayTripPage;
import com.spiecejet.pages.RoundTripPage;

public class RoundTripTest extends RoundTripPage{

@Test	
	public void roundTrip() {

		try {

			launchBrowser("https://www.spicejet.com/");

			RoundTripPage round = PageFactory.initElements(driver, RoundTripPage.class);
			round.round();
			round.onLocation("chen");
			//round.onLocation1("hy");
			round.onLocation1("koc");
			round.clickCalender();
			round.selectCalender();
			round.selectParticularCalender();
			round.selectEndCalender();
}
		
		catch(Exception e) {
			
		
		
		}
		}
}