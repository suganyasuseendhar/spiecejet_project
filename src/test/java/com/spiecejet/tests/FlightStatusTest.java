package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spiecejet.pages.FlightStatusPage;
import com.spiecejet.pages.SignUpPage;

public class FlightStatusTest extends FlightStatusPage{

	@Test
	public void signUP() {

		try {

			launchBrowser("https://www.spicejet.com/");

			FlightStatusPage status = PageFactory.initElements(driver, FlightStatusPage.class);
			
			status.clickFlightStatus();
			status.clickDepatureDate("Tomorrow");
			
			
			
			
			
}catch (Exception e) {

	System.out.println("Problem while signup your account");
	e.printStackTrace();
}
}
}
