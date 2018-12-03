package co.com.computrabajo.www.certificacion.tasks;

// This is just a click on a target. I created this task due to
// the way I wrote my features, but it probably should not exists

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Task {

	private Target option;
	
	public ClickOn(Target option) {
		this.option=option;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(option));
	}

	public static ClickOn theOption(Target optionToClick) {
		// TODO Auto-generated method stub
		return instrumented(ClickOn.class,optionToClick);	}
	
	

}
