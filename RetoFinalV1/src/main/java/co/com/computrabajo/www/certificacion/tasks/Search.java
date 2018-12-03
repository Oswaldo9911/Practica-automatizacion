package co.com.computrabajo.www.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.www.certificacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
// This task will search a Job in computrabajo
public class Search implements Task{

	private String job;
	
	public Search(String job) {
		this.job=job;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(job).
				into(HomePage.txtSEARCH_A_JOB),
				Click.on(HomePage.btnSEARCH));
	}

	public static Search theJob(String job2) {
		// TODO Auto-generated method stub
		return instrumented(Search.class,job2);
	}
	


}
