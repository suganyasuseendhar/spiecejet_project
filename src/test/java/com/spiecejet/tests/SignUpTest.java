package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.spiecejet.utils.Reports;
import com.spiecejet.pages.SignUpPage;



@Listeners(Reports.class)



public class SignUpTest extends SignUpPage {
	Reports report = new Reports();

	@Test(priority = 0)
	public void signUP() {

		try {

			
			report.setTCDesc("Validate signup functionality");
			//launchBrowser("https://spiceclub.spicejet.com/signup");

			SignUpPage signpage = PageFactory.initElements(driver, SignUpPage.class);
			signpage.clickSelect();
			signpage.enterFirstName("suganya");
			signpage.enterLastName("suseendhar");
			signpage.enterPassword("GSugan@1234");
			signpage.enterCPassword("GSugan@1234");
			signpage.enterEmail("suganit37@gmail.com");

			signpage.clickcountry();
			signpage.dobClick();
			signpage.clickMonth("September");
			signpage.clickYear("1993");
			signpage.clickDate("15");
			signpage.enterPhoneNumber("7358638444");

			signpage.agreeClick();
			Thread.sleep(2000);
			//signpage.redButtonClick();
			//signpage.redButtonClick();
			signpage.clickSubmitButton();
		} catch (Exception e) {

			System.out.println("Problem while signup your account");
			e.printStackTrace();
		}
	}

}
