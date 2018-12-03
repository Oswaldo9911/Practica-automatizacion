package com.google.StepsDefinitions;

import java.util.List;

import com.google.pages.MyNewPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OtherSteps {
	
	MyNewPOM ins=new MyNewPOM();
	
	@Given("I open the browser")
	public void i_open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Abro navegador");
	    ins.openBrowser();
	}

	@Given("I go to the URL (.*)")
	public void i_go_to_the_URL(String string) {
	    // Write code here that turns the phrase above into concrete actions
		string=string.replace("'", "");
		System.out.println(string);
		ins.goToURL(string);
	}

	@When("I write my credentials")
	public void i_write_my_credentials(io.cucumber.datatable.DataTable credentials) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<String> list = credentials.asList(String.class);
		
		ins.writeOnElementByName("email", list.get(0));
		System.out.println(list.get(0));
		ins.writeOnElementByName("pass", list.get(1));
		System.out.println(list.get(1));
		ins.clickOnLoginButton();
	}

	@Then("I should be in the URL (.*)")
	public void i_should_be_in_the_URL(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
