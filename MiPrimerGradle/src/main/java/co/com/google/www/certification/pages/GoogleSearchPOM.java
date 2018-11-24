package co.com.google.www.certification.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPOM {
	
	// The WebDriver must be static. This way, I can use it in
	// the other methods
	static WebDriver Daniel; 

	
	public static void openBrowser(String url) {
		
		// Here I indicate the location of my driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		// This is my WebDriver. It's initialize as a ChromeDriver.
		// In this step, I will open the browser.
		Daniel = new ChromeDriver();
		// Here I go to the url.
		Daniel.get(url); 
		
	}
	
	public static void searchWord(String id, String word) {
		
		// This is the expected condition I use to assign a value
		// to the WebElement TextBox.
		// This WebElement is Google's home page search field
		// I use presence as my expected condition. If the search
		// field is present in the DOM of the page, then it will 
		// be assign to the WebElement. 
		// If the search box does not appear in 10 seconds, an
		// exception will occur.
		WebElement TextBox = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.name(id)));
		TextBox.sendKeys(word+Keys.ENTER);
		
	}
	
	// Here I close the browser.
	public static void closeBrowser() {
		// .close() is a selenium method
		// I can also use .quit(), which closes all the windows
		// opened by the driver and ends its session.
		Daniel.close(); 

	}

}
