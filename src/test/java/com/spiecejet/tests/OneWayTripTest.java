package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spiecejet.pages.OneWayTripPage;
import com.spiecejet.pages.SignUpPage;

public class OneWayTripTest extends OneWayTripPage{
	
	@Test
	public void oneway() {

		try {

			launchBrowser("https://www.spicejet.com/");

			OneWayTripPage oneWay = PageFactory.initElements(driver, OneWayTripPage.class);
			oneWay.singleDirection();
			oneWay.onLocation("chen");
			oneWay.endLoca("hy");
			oneWay.clickCalender();
			oneWay.selectParticularCalender();
			//oneWay.multiselect();
			//oneWay.selectpassengers2("Children");
			//oneWay.sendChild("2");
			oneWay.selectCurrency("INR");
			oneWay.selectfamilyFriends("Family & Friends");
			oneWay.clickSearchFlight();
		} catch (Exception e) {

			System.out.println("Problem while one way trip");
			e.printStackTrace();
		}
	}

}
