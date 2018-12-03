package co.com.computrabajo.www.certificacion.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.computrabajo.www.certificacion.userinterfaces.JobPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheApplyButton implements Question<Boolean> {

	// I check if the apply button is present. The page is loaded
	// too quick, so if I use .isVisible(), I will get an exception
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(JobPage.btnAPPLY).answeredBy(actor).isPresent();
	}
	
	public static TheApplyButton isVisible() {
		return new TheApplyButton();
	}
	
}
