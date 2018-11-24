package com.google.www.certificacion.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.www.certificacion.pages.GoogleSearch_WebDriverConf;

public class GoogleSearchPreLogin {

	// My url is going to be google. I will search a word with 
	// this test
	String url = new String("http://www.google.com");
	// The word I'm going to search
	String word = new String("Suso");
	//I instantiate the class with my WebDriver
	GoogleSearch_WebDriverConf googlesearch = new GoogleSearch_WebDriverConf();

	
	// The descriptions of these methods are related to the ones
	// in the project MiPrimerGradle
	@Before
	public void setUp() throws Exception {

		googlesearch.openBrowser(url);

	}

	@After
	public void tearDown() throws Exception {
		
		googlesearch.closeBrowser();
	}

	@Test
	public void test() {
		googlesearch.searchWord(word);
	}

}
