package co.com.google.www.certification.tests;


// Annotations from JUnit
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.com.google.www.certification.pages.GoogleSearchPOM;

public class GoogleSearch {
	
	String url="http://www.google.com"; // Server
	String word = "Suso"; // The word I will search
	String txtSearchInput_Name="q"; // Name of the text input

	@Before// Annotation with the method that will be 
	// executed before every test begins.
	public void setUp() throws Exception {
		// Before every @Test, I must open the browser
		GoogleSearchPOM.openBrowser(url);
	}

	@After // Annotation with the method that will be 
	// executed after a test ends.
	public void tearDown() throws Exception {
		// After every @Test, I must close my web browser
		GoogleSearchPOM.closeBrowser();
	}

	@Test // This is the test that will be performed
	public void test() {
		// Here I send the name of the text input and the word
		// I want to search
		GoogleSearchPOM.searchWord(txtSearchInput_Name, word);
		// Simple assert to see how it works.
		assert word!=null:String.format("Word es null");
	}
	

}
