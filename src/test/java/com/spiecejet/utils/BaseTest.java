package com.spiecejet.utils;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.support.ui.ExpectedConditions;



import io.github.bonigarcia.wdm.WebDriverManager;


	
	

	public class BaseTest{

	public static WebDriver driver = null;

	public void launchBrowser(String url) {

		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			
		} catch (Exception ex) {
		
			System.out.println("Problem while launching Browser");
			
			ex.printStackTrace();
		}

	}
	public void clickAction(WebElement ele) {
		try {
			ele.click();
			
		} catch (Exception ex) {
			
			System.out.println("Problem while doing click Actions");
			
			ex.printStackTrace();
		}
	}	
	public void waitForElement(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

	public void typeText(WebElement ele, String text) {
		try {
			ele.clear();
			ele.sendKeys(text);
			
		} catch (Exception ex) {
			
			System.out.println("Problem while doing entering the text");
			ex.printStackTrace();
		}
	}


	public void brokenLinks(String url) {
		
		
		

		try {
			HttpURLConnection httpConnection = (HttpURLConnection) (new URL(url).openConnection());
			httpConnection.connect();
			int respCode= httpConnection.getResponseCode();
			
			
			
			if ( respCode >= 400) {

				System.out.println(url + " is broken and its response code is "+respCode);

			} else {

				System.out.println(url + " is a valid link and its reponse code is "+respCode);

			}
		}
		catch(Exception ex)
		{
			System.out.println("Problem while to finding broken links");
			ex.printStackTrace();
		}
		
	}

	public void validateMenu(String url) {
		
		List<WebElement> links = driver.findElements(By.tagName("li"));
		System.out.println(links.size());
		for (int i = 1; i<=links.size(); i=i+1)
		{
		System.out.println(links.get(i).getText());
		}
		}
		



	/*public void validateMenu1(String url) {
		
		
		List<WebElement> links = driver.findElements(By.tagName("li"));
		List<WebElement> titleText = getTitle(links);
		System.out.println(links.size());
		for (int i = 1; i<=links.size(); i=i+1){
			for (int j = 1; j<=links.size(); j=i+1){
				System.out.println(links.get(j).getText() + titleText );
			}
		
			System.out.println(links.get(i).getText() + titleText );
		}
	}

		/*
		List<WebElement>  element = driver.findElements(By.id("department_name"));
		List<WebElement> dropdown = driver.findElements(By.tagName("select"));  
		System.out.println(dropdown.size());
		
		/*for (int j = 1; j<=dropdown.size(); j=j+1)
		{
		System.out.println(dropdown.get(j).getText());
		}*/
	/*private List<WebElement> getTitle(List<WebElement> links) {
		// TODO Auto-generated method stub
		return null;
	}*/
		
	public void bootomLinkValidation(String url) {
		
	try {
		WebElement footer	= driver.findElement(By.xpath("//div[@class ='flex justify-content-start']"));
		List <WebElement> links = footer.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("the number of links in the footer : " + count );
			for (WebElement textLinks : links) {
				
				System.out.println("the footer links contains tags are : " + textLinks.getText()) ;
			}
	} catch (Exception e) {
		System.out.println("Problem while bottom link validation");
		e.printStackTrace();
	}
		
		
	}


	public void quitBrowser() {
		try {
			driver.quit();
			
		} catch (Exception ex) {
			
			System.out.println("Problem while Browser qutting");
			ex.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.close();
			

		}
		catch (Exception ex) {
			
			System.out.println("Problem while closing Browser");
			ex.printStackTrace();
		}
	}


	public void jsScrollUpToElement(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
		} catch (Exception e) {
			
			System.out.println("Problem while scrollup the element");
			e.printStackTrace();
		}
	}


	public void jsClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
		} catch (Exception e) {
			
			System.out.println("Problem while js click");
			e.printStackTrace();
		}
	}

	public void moveTo(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
		} catch (Exception ex) {
			
			System.out.println("Problem while move To element");
			ex.printStackTrace();
		}
	}

	public void selectDDByVisibleText(WebElement ele, String VisibleText) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(VisibleText);
		} catch (Exception ex) {
			
			System.out.println("Problem while visible text");
			ex.printStackTrace();
		}
	}

	public void alertClick() {
		
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert text is : " + text);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
	}


	public void getEnterValue() {
		
		String actualResult = driver.findElement(By.xpath("//p[@id='confirmdemo']")).getText();
		System.out.println("the actual result is : " + actualResult);
		String exceptedResult = "You Clicked on OK!";
		
		System.out.println("Problem while getting value");
		
		
	}

	public void screenShot(String signIn) {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("./Photos/" + signIn + ".png");

			FileUtils.copyFile(source, dest);
		} catch (Exception e) {
			
			System.out.println("Problem while Taking ScreenShot");
			e.printStackTrace();
		}
	}

	public void menuLinkValidation(String url) {
		
	try {
		WebElement menu	= driver.findElement(By.xpath("//ul[@class ='bottom-nav-left lv']"));
		List <WebElement> links = menu.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("the number of links in the menu : " + count );
			for (WebElement textLinks : links) {
				
				System.out.println("the menu links contains tags are : " + textLinks.getText()) ;
			}
	} catch (Exception e) {
		System.out.println("Problem while menu link validation");
		e.printStackTrace();
	}
		
		
	}
	 public void ValidateMenuTitle(String expectedTitle) {
		 
		 
		    try {
				
				Assert.assertEquals(driver.getTitle(), expectedTitle);
				System.out.println("Test completed- menu verified");
			} catch (Exception e) {
				
				System.out.println("Problem while validating title");
				e.printStackTrace();
			}
		 
	 }
	 
	 public void selectDDByIndex(WebElement ele, int index) {
			try {
				Select sel = new Select(ele);
				sel.selectByIndex(index);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	 
	 
	public void exactDate(WebElement ele, String day) {
		
		WebElement dayToClick = driver.findElement(By.xpath("(//div[text()=" + day + ")]"));
	       dayToClick.click();
	}
	
	
	
	/*public void multiselect(WebElement ele) {
		Select sel = new Select(ele);
		
		//Select selectelement = new Select(driver.findElement(By.xpath("//div[text()='Passengers']")));
		
	//boolean	bool1= selectelement.isMultiple();
		boolean	bool1= 	sel.isMultiple();
	System.out.println(bool1);
	}*/
	
	public void multiselect(String value) {
		Select selElement = new Select(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[2]")));
		//sel.isMultiple();
		/*System.out.println(bool1);*/
		//selElement.selectByIndex(0);
		//selElement.selectByIndex(1);
		//selElement.selectByIndex(0);
		
		
		
	}
	
	public void doubeclick(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.doubleClick(ele).build().perform();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	

	/*public void sendChild(String value) {
		
		WebElement menu	= driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'])[2]"));
		sel.selectByVisibleText(VisibleText);
		//@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'])[2]");
		//WebElement children;
		waitForElement(menu);
		//clickAction(passengers2);
		//selectDDByVisibleText(passengers2, content);
		//multiselect();
		typeText(menu, value);
		
	}*/
	}

	
	
	
