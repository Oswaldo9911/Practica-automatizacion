package co.com.computrabajo.www.certificacion.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.computrabajo.www.certificacion.exceptions.BadApplication;
import co.com.computrabajo.www.certificacion.questions.TheApplyButton;
import co.com.computrabajo.www.certificacion.tasks.Choose;
import co.com.computrabajo.www.certificacion.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

public class SearchAJobStepsDefinitions {

	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor david= Actor.named("David");
		
	@Before
	public void setUp() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@When("^David searches a Job$")
	public void davidSearchesAJob(List<String> job) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    david.attemptsTo(Search.theJob(job.get(0)));
	}

	@Then("^he chooses the option number he wants$")
	public void heChoosesTheOptionNumberHeWants(List<Integer> number) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    david.attemptsTo(Choose.theJobNumber(number.get(0)));
	    david.should(seeThat(TheApplyButton.isVisible()).orComplainWith(BadApplication.class, "The apply button is not present"));
	}
	
}
