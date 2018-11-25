package com.google.mail.certification.tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.mail.certification.pages.GmailPreLogin;

public class LoginToGmail {
	
	// Browser and Driver settings.
	WebDriver Daniel; // My WebDriver
	String BrowserDriver="webdriver.chrome.driver"; // My Browser Driver
	String BrowserDriverPath="C:\\Selenium\\chromedriver_win32\\chromedriver.exe"; // Path of my Browser Driver
	String url = "https://accounts.google.com"; // URL I will go to, in every before
	String urlGmail="https://mail.google.com/"; // Gmail's URL
	
	//WebElements
	WebElement usernameField; // Username Field. 
	WebElement passwordField; // Password Field
	WebElement welcomeMessageLabel; // Welcome Message for assert.
	
	// IDs and XPath of WebElements
	String usernameID="identifierId";
	String passwordXPath=".//*[@id=\"password\"]/div[1]/div/div[1]/input";
	String welcomeMessageXPath=".//*[@id=\"yDmH0d\"]/div[2]/c-wiz/div/div/div[5]/div[1]/c-wiz/div/div[1]/div/div[2]";
	String ComposeButtonXPath=".//*[@id=\":kc\"]/div/div";
	
	// Login data
	// Write two Strings called username and password. Use them
	// to login to gmail.
	String username=""; 
	String password = "";
	
	// Message I will compare with assert
	String WelcomeMessageExpected="Te damos la bienvenida, David Ayala.";
	
	// Instance
	GmailPreLogin preLogin = new GmailPreLogin(Daniel,BrowserDriver,BrowserDriverPath);
	
	//Screenshots I will take, and their paths
	String Destino="C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures\\screenshot.png";
	String Destino2="C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures\\screenshot2.png";
	
	
	
	@Before
	public void setUp() throws Exception {
		preLogin.openURL(url); // Open url before every Test
		
	}

	@After
	public void tearDown() throws Exception {
		preLogin.closeBrowser(); // Close Browser after every test
	}

	@Test
	public void test() {

		usernameField=preLogin.searchElementByID(usernameID); // Find input for username
		
		preLogin.writeDataOnWebElement(usernameField, username); // Write my email
		preLogin.typeEnterOnWebElement(usernameField); // Enter on input for username
		
		passwordField=preLogin.searchElementByXPath(passwordXPath); // Find input for password
		preLogin.writeDataOnWebElement(passwordField, password); // Write my password
		preLogin.typeEnterOnWebElement(passwordField); // Enter on input for password
		welcomeMessageLabel=preLogin.searchElementByXPath(welcomeMessageXPath); // Get Welcome Message on the web
		System.out.println(welcomeMessageLabel.getText()); // Print to check
		assert welcomeMessageLabel.getText().equals(WelcomeMessageExpected); // Assert they are equals. If true, my profile logged in
		preLogin.takeScreenshot(Destino); // Take screenshot of Welcome Page
		preLogin.openURL(urlGmail); // Go to gmail
		preLogin.takeScreenshot(Destino2); // Take second screenshot to check 
		
	}
	

	


}
