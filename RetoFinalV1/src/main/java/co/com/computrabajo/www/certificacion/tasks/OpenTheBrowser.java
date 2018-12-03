package co.com.computrabajo.www.certificacion.tasks;

// This task opens the browser in the main page of computrabajo
// It also contains the question related to no internet connection

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.www.certificacion.exceptions.NoConnection;
import co.com.computrabajo.www.certificacion.questions.TheSearchField;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class OpenTheBrowser implements Task {

	
	private PageObject page;
	
	
	public OpenTheBrowser(PageObject page) {
		this.page=page;
	}
	
	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
		actor.should(seeThat(TheSearchField.isVisible()).
				orComplainWith(NoConnection.class, 
						"The search field has not been loaded"));
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);

	}

}
