package co.com.computrabajo.www.certificacion.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.computrabajo.www.certificacion.userinterfaces.HomePage;
import co.com.computrabajo.www.certificacion.userinterfaces.GoodApplicationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheSearchField implements Question<Boolean>{

	public static TheSearchField isVisible() {
		return new TheSearchField();
	}

	// Here I ask if the search field is visible. If this 
	// field is not visible, I cannot search a job.
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(HomePage.txtSEARCH_A_JOB).answeredBy(actor).isCurrentlyVisible();
	}

}
