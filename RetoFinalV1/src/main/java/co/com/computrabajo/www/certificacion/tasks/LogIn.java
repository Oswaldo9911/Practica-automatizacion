package co.com.computrabajo.www.certificacion.tasks;

// This task logs me in computrabajo. It receives my email and 
// password from the model LoginData.

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.www.certificacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task {

	private String email;
	private String passw;
	
	public LogIn(String email,String passw) {
		this.email=email;
		this.passw=passw;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(email).into(HomePage.txtEMAIL),
				Enter.theValue(passw).into(HomePage.txtPASSWORD),
				Click.on(HomePage.btnLOGIN));
		
	}

	public static LogIn withHisCredentials(String email2, String passw2) {
		// TODO Auto-generated method stub
		return instrumented(LogIn.class,email2,passw2);
	}

}
