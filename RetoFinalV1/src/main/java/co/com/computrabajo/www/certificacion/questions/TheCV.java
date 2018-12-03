package co.com.computrabajo.www.certificacion.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.computrabajo.www.certificacion.userinterfaces.GoodApplicationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheCV implements Question<Boolean>  {
	
	// I check if the CV sent message is visible.
	// This element loads quickly with the page, so I can use
	// isCurrentlyVisible() instead of isPresent()
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(GoodApplicationPage.lblCV_SENT_MESSAGE).answeredBy(actor).isCurrentlyVisible();
	}

	public static TheCV wasSent() {
		return new TheCV();
	}

}
