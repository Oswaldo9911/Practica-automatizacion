package com.google.www.StepsDefinitions;

import com.google.www.pages.SearchInGooglePOM;

// With .Scenario I can write data on my report. It's a must
// and I have to get it in a Before or in an After method.
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchInGoogleStepsDefinitions {
	
	String url="https://www.google.com/";
	String name="q";
	String word="Suso";
	String titulo="Suso - Buscar con Google";
	
	// This is my POM
	SearchInGooglePOM insPOM= new SearchInGooglePOM();
	
	@Given("I open the Browser")
	public void i_open_the_Browser() {
		// I open the browser
		insPOM.openBrowser();
	}

	@When("I go to Google")
	public void i_go_to_Google() {
		// I go to my URL
		insPOM.goToURL(url);
	}

	@When("search the word")
	public void search_the_word() {
		// I search the word
		insPOM.searchWord(name, word);
	}

	@Then("I validate the result")
	public void i_validate_the_result() {
		//I get the title from the webpage and compare it with
		// my string titulo.
		//System.out.println(scenario.getName());
		assert insPOM.getTitleFromWebPage().equals(titulo);
	}
	
	//After every scenario, I take a screenshot
	@After
	public void scrennSHOTS(Scenario sce) {
		insPOM.takeScreenshot(sce);
	}
	
}
