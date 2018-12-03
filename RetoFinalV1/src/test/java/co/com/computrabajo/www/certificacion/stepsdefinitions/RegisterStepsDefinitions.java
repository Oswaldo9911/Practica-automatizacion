package co.com.computrabajo.www.certificacion.stepsdefinitions;

import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.computrabajo.www.certificacion.exceptions.BadRegistering;
import co.com.computrabajo.www.certificacion.models.RegistryData;
import co.com.computrabajo.www.certificacion.questions.TheErrorMessage;
import co.com.computrabajo.www.certificacion.tasks.ClickOn;
import co.com.computrabajo.www.certificacion.tasks.Register;
import co.com.computrabajo.www.certificacion.userinterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterStepsDefinitions {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor david= Actor.named("David");
		
	@Before
	public void setUp() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@When("^he clicks the registry button$")
	public void i_click_the_registry_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		david.attemptsTo(ClickOn.theOption(HomePage.btnREGISTER));
	}

	@When("^tries to register with his old information$")
	public void try_to_register_with_my_old_credentials(List<RegistryData> information) throws Exception {
		
		david.attemptsTo(Register.inThePage(information));
	    
	}

	@Then("^he should see the message \"([^\"]*)\"$")
	public void i_should_see_the_message(String errormessage) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
		david.should(seeThat(TheErrorMessage.inTheEmptyFields(),
				equalTo(errormessage)).orComplainWith(
						BadRegistering.class,
						"Your bad registering was worst than bad"));
		
	}
	
	
}
