package com.spiecejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.spiecejet.utils.BaseTest;

public class OneWayTripPage extends BaseTest {

	@FindBy(xpath = "//div[text()='one way']")
	WebElement oneWay;

	public void singleDirection() {

		waitForElement(oneWay);
		clickAction(oneWay);
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement departureDate;

	public void onLocation(String nameOfLocation) {

		waitForElement(departureDate);
		typeText(departureDate, nameOfLocation );
	}
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement returnDate;

	public void endLoca(String nameOfEndLocation) {
		
		waitForElement(returnDate);
		typeText(returnDate, nameOfEndLocation );
	}
	
	@FindBy(xpath = "(//div[text()='Departure Date']")
	WebElement calenderDate;

	public void clickCalender() {
		
		waitForElement(calenderDate);
		clickAction(calenderDate);
	}
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1niwhzg r-z2wwpe r-17b9qp5 r-1g94qm0 r-h3f8nf r-u8s1d r-u3yave r-8fdsdq']")
	WebElement clickDate;

	public void selectCalender() {
		
		waitForElement(clickDate);
		clickAction(clickDate);
	}
	
	@FindBy(xpath = "(//div[text()='10'])[3]")
	WebElement clickParticularDate;

	public void selectParticularCalender() {
		
		waitForElement(clickParticularDate);
		clickAction(clickParticularDate);
	}
	
	
	
	/*@FindBy(xpath = "(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[2]")
	WebElement passengers;

	public void selectpassengers() {
		
		waitForElement(passengers);
		clickAction(passengers);
		
		
	}
	
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[2]")
	WebElement passengers2;

	public void selectpassengers2(String content) {
		
		waitForElement(passengers2);
		clickAction(passengers2);
		sendChild(content);
		//selectDDByVisibleText(passengers2, content);
		//multiselect();
		
	}

	
	*/
			
		/*	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'])[2]")
			WebElement children;

			public void sendChild(String value) {
				
				waitForElement(children);
				//clickAction(passengers2);
				//selectDDByVisibleText(passengers2, content);
				//multiselect();
				typeText(children, value);
				
			}	*/	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			



@FindBy  (xpath = "//div[text()='Currency']")
WebElement currency;


public void selectCurrency(String curr) {

	waitForElement(currency);
	clickAction(currency);
	selectDDByVisibleText(currency, curr);
}


@FindBy  (xpath = "//div[text()='Family & Friends']")
WebElement familyFriends;


public void selectfamilyFriends(String family) {

	waitForElement(familyFriends);
	clickAction(familyFriends);
	//selectDDByVisibleText(currency, curr);
}



@FindBy  (xpath = "//div[text()='Search Flight']")
WebElement searchFlight;


public void clickSearchFlight() {

	waitForElement(searchFlight);
	//clickAction(searchFlight);
	//jsClick(searchFlight);
	doubeclick(searchFlight);
	//selectDDByVisibleText(currency, curr);
}
}





	/*public void multiselect() {
		Select sel = new Select(passengers);
		sel.isMultiple();
		*/
		
		
	
