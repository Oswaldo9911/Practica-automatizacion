package com.google.StepsDefinitions;

import java.util.List;

import com.google.pages.MyNewPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompuSteps {

	MyNewPOM ins=new MyNewPOM();
	
	@Given("I open Chrome")
	public void i_open_Chrome() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Abro navegador");
	    ins.openBrowser();
	}

	@Given("I go to Computrabajo (.*)")
	public void i_go_to_Computrabajo(String url) {
	    // Write code here that turns the phrase above into concrete actions
		url=url.replace("'", "");
		System.out.println(url);
		ins.goToURL(url);
	}

	@When("I write my mail and pass")
	public void i_write_my_mail_and_pass(io.cucumber.datatable.DataTable credentials) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
List<String> list = credentials.asList(String.class);
		
		ins.writeOnElementByName("EmailField", list.get(0));
		System.out.println(list.get(0));
		ins.writeOnElementByName("PasswordField", list.get(1));
		System.out.println(list.get(1));
		ins.clickOnLoginButton();
	}

	@Then("I should be inside (.*)")
	public void i_should_be_inside(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	
}
