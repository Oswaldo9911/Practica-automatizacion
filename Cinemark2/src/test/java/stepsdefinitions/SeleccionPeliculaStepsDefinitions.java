package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.cinemark.www.certification.pages.tasks.Buscar;
import co.com.cinemark.www.certification.pages.tasks.OpenTheBrowser;
import co.com.cinemark.www.certification.pages.userinterfaces.CinemarkMovies;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class SeleccionPeliculaStepsDefinitions {

	CinemarkMovies cinemark;
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;

	private Actor david= Actor.named("David");
	
	// Acá yo asigno el browser a mi actor. No tengo que volver
	// a declarar webdriver de nuevo.
	@Before
	public void setUp() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^que puedo acceder a Cinemark$")
	public void que_puedo_acceder_a_Cinemark() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		david.wasAbleTo(OpenTheBrowser.on(cinemark));
		
	}

	@When("^busco la pelicula (.*)$")
	public void busco_la_pelicula(String pelicula) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		david.wasAbleTo(Buscar.TheMovie(pelicula));
	}

	@When("^la selecciono$")
	public void la_selecciono() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^entro al link de la pelicula$")
	public void entro_al_link_de_la_pelicula() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
