package co.com.computrabajo.www.certificacion.questions;

import co.com.computrabajo.www.certificacion.userinterfaces.RegistryForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheErrorMessage implements Question<String> {

	// Here return the text of the error message I want to see 
	// in the registry form
	
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(RegistryForm.lblEMAIL_IS_MANDATORY).viewedBy(actor).asString();
	}

	public static TheErrorMessage inTheEmptyFields() {
		return new TheErrorMessage();
	}

}
