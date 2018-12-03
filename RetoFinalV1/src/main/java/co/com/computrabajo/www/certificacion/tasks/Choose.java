package co.com.computrabajo.www.certificacion.tasks;

// This task chooses the job I will apply to. It receives an
// integer that will be the number of the offer I will take

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.computrabajo.www.certificacion.interactions.SelectInTheResultsList;
import co.com.computrabajo.www.certificacion.userinterfaces.SearchResult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Choose implements Task{
	private int number;
	
	public Choose(int number) {
		this.number=number;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SelectInTheResultsList.theOption(SearchResult.JOB,number));
	}

	public static Performable theJobNumber(int number) {
		return instrumented(Choose.class,number);
	}



}
