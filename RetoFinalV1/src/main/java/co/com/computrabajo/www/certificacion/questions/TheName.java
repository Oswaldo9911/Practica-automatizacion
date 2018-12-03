package co.com.computrabajo.www.certificacion.questions;


import co.com.computrabajo.www.certificacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheName implements Question<String> {

	// Here I return my name in the navigation bar after a
	// succesful login
	
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(HomePage.lblUSERNAME).viewedBy(actor).asString();
	}

	public static TheName inTheNavBar() {
		// TODO Auto-generated method stub
		return new TheName();
	}
	
	

}
