// In this stepdefinitions, I apply to a job, after logging in 
// and searching it.

package co.com.computrabajo.www.certificacion.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.computrabajo.www.certificacion.exceptions.BadApplication;
import co.com.computrabajo.www.certificacion.questions.TheCV;
import co.com.computrabajo.www.certificacion.tasks.ClickOn;
import co.com.computrabajo.www.certificacion.userinterfaces.JobPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ApplyToAJobStepsDefinitions {

	// My driver is Chrome. It's in the root of the project
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	// My actor called David.
	private Actor david= Actor.named("David");
	
	// Here I vinculate my driver and my actor
	@Before
	public void setUp() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	// Step where I apply to an offer. I just have to click a
	// button and that's it.
	@When("^he applies to the offer$")
	public void iApplyToTheOffer() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    david.attemptsTo(ClickOn.theOption(JobPage.btnAPPLY));
	}

	// After applying, usually I will get a 
	// confirmation message, telling me that my CV was sent.
	// If it is visible, then the task ended succesfully
	@Then("^he should see a confirmation message$")
	public void iShouldSeeAConfirmationMessage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    david.should(seeThat(TheCV.wasSent()).orComplainWith(BadApplication.class, "You could not apply to this offer. Try another one."));
	}
	
}
