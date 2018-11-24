package com.google.www.certificacion.pages;

// With By I will specify the 
// method I will use to find a WebElement
import org.openqa.selenium.By;
// With Keys I send keys from the keyboard to a WebElement
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
// ExpectedConditions and WebDriverWait are necessary to
// create a condition that will stop the WebDriver while a
// WebElement is being load in the DOM
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch_WebDriverConf {
	 
	static WebDriver Daniel;
	
	// Constructor
	public GoogleSearch_WebDriverConf() {
		// Here I indicate the location of my driver
		// This time, I'm going to use Internet Explorer
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_3.141.0\\IEDriverServer.exe");
		// My driver is an Internet Explorer Driver
		Daniel = new InternetExplorerDriver();
		
	}
		
		
		
	public void openBrowser(String url) {
		// Here I go to the url.
		Daniel.get(url); 
		
	}
	
	public void searchWord(String word) {
		
		// This is the expected condition I use to assign a value
		// to the WebElement TextBox.
		// This WebElement is Google's home page search field
		// I use presence as my expected condition. If the search
		// field is present in the DOM of the page, then it will 
		// be assign to the WebElement. 
		// If the search box does not appear in 10 seconds, an
		// exception will occur.
		WebElement TextBox = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		TextBox.sendKeys(word+Keys.ENTER);
		
	}
	
	// Here I close the browser.
	public void closeBrowser() {
		// .close() is a selenium method
		// I can also use .quit(), which closes all the windows
		// opened by the driver and ends its session.
		Daniel.close(); 

	}
}
