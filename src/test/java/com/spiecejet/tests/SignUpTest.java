package com.spiecejet.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.spiecejet.pages.SignUpPage;

public class SignUpTest extends SignUpPage {

	@Test
	public void signUP() {

		try {

			launchBrowser("https://spiceclub.spicejet.com/signup");

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
			signpage.redButtonClick();

		} catch (Exception e) {

			System.out.println("Problem while signup your account");
			e.printStackTrace();
		}
	}

}
