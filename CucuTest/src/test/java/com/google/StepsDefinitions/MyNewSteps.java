package com.google.StepsDefinitions;

import java.util.Map;

import com.google.pages.MyNewPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MyNewSteps {

	String url="https://www.elempleo.com/co/iniciar-sesion";
	String txtEmailName="EmailField";
	String txtPassword="PasswordField";
	String email="lst-ib";
	String word="Suso";
	String titulo="Suso - Buscar con Google";
	MyNewPOM ins=new MyNewPOM();
	
	@Given("I want to write a step")
	public void i_want_to_write_a_step() {
	    // Write code here that turns the phrase above into concrete actions
	    ins.openBrowser();
	    ins.goToURL(url);
	}

	
	@When("I complete action with a word")
	public void i_complete_action_with(DataTable myTable) {
	    // Write code here that turns the phrase above into concrete actions
		Map<String,String> m=myTable.asMap(String.class, String.class);
		String key="Ironman";
			
		System.out.println(m.get(key));
		//ins.searchWord(id, m.get(key));
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		assert ins.getTitleFromWebPage().equals(titulo);
	}
	
}
