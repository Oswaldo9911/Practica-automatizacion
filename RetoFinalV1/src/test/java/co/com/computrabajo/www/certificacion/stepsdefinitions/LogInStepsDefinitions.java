package co.com.computrabajo.www.certificacion.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.computrabajo.www.certificacion.exceptions.UnableToLogin;
import co.com.computrabajo.www.certificacion.models.LoginData;
import co.com.computrabajo.www.certificacion.questions.TheName;
import co.com.computrabajo.www.certificacion.tasks.ClickOn;
import co.com.computrabajo.www.certificacion.tasks.LogIn;
import co.com.computrabajo.www.certificacion.tasks.OpenTheBrowser;
import co.com.computrabajo.www.certificacion.userinterfaces.HomePage;
import static co.com.computrabajo.www.certificacion.exceptions.UnableToLogin.getUnableToLoginMessage;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

public class LogInStepsDefinitions {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor david= Actor.named("David");
	
	private HomePage computrabajoHomePage;
	
	@Before
	public void setUp() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that David goes to the web$")
	public void thatDavidGoesToTheWeb() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		david.wasAbleTo(OpenTheBrowser.on(computrabajoHomePage));
	}

	@When("^he clicks the Login button$")
	public void heClicksTheLoginButton() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  david.attemptsTo(ClickOn.theOption(HomePage.LOGIN_NAVBAR_OPTION));  
	}

	@When("^logs in with his email and password$")
	public void logsInWithHisAnd(List<LoginData> credentials) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    david.attemptsTo(LogIn.withHisCredentials(credentials.get(0).getEmail(),credentials.get(0).getPassword()));
	}

	@Then("^he should see his name")
	public void heShouldSeeHis(List<String> name) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	  david.should(seeThat(TheName.inTheNavBar(),equalTo(name.get(0))).orComplainWith(UnableToLogin.class, getUnableToLoginMessage()));
	}
	
}
