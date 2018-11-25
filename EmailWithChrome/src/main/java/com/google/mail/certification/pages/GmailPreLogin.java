package com.google.mail.certification.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//Output type of my screenshot. I use .FILE
import org.openqa.selenium.OutputType;
// With this library, I can take screenshots of my full page.
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//With these libraries, I make my driver wait with my expected conditions.
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class GmailPreLogin {

	WebDriver Daniel; // My WebDriver

	public GmailPreLogin(WebDriver Daniel, String BrowserDriver, String BrowserDriverPath) {
		// This is my webdriver and its settings. The latters are sent from
		// the junit test file.
		this.Daniel = Daniel;
		System.setProperty(BrowserDriver, BrowserDriverPath);
		this.Daniel = new ChromeDriver();

		
		// Maximize window
		this.Daniel.manage().window().maximize();
	}
	

	public void openURL(String url) {

		// I get URL and then GO!
		Daniel.get(url);

	}
	
	// In the following three functions, I will get and return the WebElement I need
	// adding an Explicit Wait in case that the page is slow.

	public WebElement searchElementByID(String id) {

		WebElement ElementByID = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));

		return ElementByID;

	}

	public WebElement searchElementByXPath(String xpath) {

		WebElement ElementByXPath = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
		return ElementByXPath;

	}
	
	public WebElement searchElementByXPathWithPresence(String xpath) {

		WebElement ElementByXPath = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		
		return ElementByXPath;
		
		
		// This block is to return a boolean when at least one condition happens.
		/*ExpectedConditions.or(
		ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)),
		ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));*/

	}
	

	public void writeDataOnWebElement(WebElement elemento, String data) {

		elemento.sendKeys(data); // Send data to web element

	}

	public void clickOnWebElement(WebElement elemento) {

		elemento.click(); // Click on web Element

	}

	public void typeEnterOnWebElement(WebElement elemento) {

		elemento.sendKeys(Keys.RETURN); // Send ENTER to Web Element

	}

	public void takeScreenshot(String Destino) {
		File scrFile = ((TakesScreenshot) Daniel).getScreenshotAs(OutputType.FILE); // Take screenshot and save on temporary file.
		File DestFile = new File(Destino); // Location where I will save my screenshot
		
		// Now I copy the file.
		try {
			Files.copy(scrFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser() {

		Daniel.close(); // Close the browser

	}

}
