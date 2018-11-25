package com.google.mail.certification.tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.mail.certification.pages.GmailComposeAndSendMail;

public class ComposeMailAndSend {


	
	WebDriver Daniel;
	String BrowserDriver="webdriver.chrome.driver";
	String BrowserDriverPath="C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	String urlGmail="https://mail.google.com/";
	
	WebElement SubjectField;
	WebElement ToField;
	WebElement MailBodyField;
	WebElement ComposeButton;
	
	String SubjectID=":po";
	String ToID=":q6";
	String MailBodyID=":qt";
	String ComposeButtonXPath=".//*[@id=\":kc\"]/div/div";
	
	String Subject="Un bot te saluda";
	String To="";
	String MailBody="Este bot fue programado para avisarte"
			+ "que eres un pastelito viche";
	
	GmailComposeAndSendMail composer =new GmailComposeAndSendMail(Daniel,BrowserDriver,BrowserDriverPath);

	
	String Destino="C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures\\screenshot2.png";
	
	
	@Before
	public void setUp() throws Exception {
		composer.openURL(urlGmail);
		ComposeButton=composer.searchElementByXPath(ComposeButtonXPath);
		composer.clickOnWebElement(ComposeButton);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	}

}
