package co.com.computrabajo.www.certification.StepsDefinitions;

import co.com.computrabajo.www.certification.pages.LoginSteps;
// Here I import my annotations. I use cucumber because
// I'm getting the methods from a feature with cucumber
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ComputrabajoLoginStepsDefinitions {
	
	@Steps // The @Steps annotation marks a Serenity step library
	LoginSteps login;
	
	// These methods speak by themselves. 
	@Given("^that I go to Computrabajo home page$")
	public void that_i_go_to_Computrabajo_home_page() {
	    login.openApplication();
	}


	@When("^I fill the email and password fields$")
	public void i_fill_the_email_and_password_fields() {
	    login.writeData();
	}

	@When("^Click the submit button$")
	public void click_the_submit_button() {
	    login.sendData();
	}

	@Then("^I access$")
	public void i_access() {
		// Here I should have a validation method, but I will create it
		// in other project.
	   System.out.println("I'm online");
	}

	
}
