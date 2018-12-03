package co.com.cinemark.www.certification.pages.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.cinemark.www.certification.pages.userinterfaces.CinemarkMovies;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {


	CinemarkMovies cinemarkMovies;

	
	@Override
	@Step("{0} opens the browser on Cinemark")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(cinemarkMovies));
	}

	public static OpenTheBrowser on(PageObject page) {
		// TODO Auto-generated method stub
		//return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class, page);
		//Este instrumented llama el constructor que cumple con los
		//parámetros en su paréntesis. En este caso va a llamar el 
		//constructor OpenTheBrowser
	}
	
}
