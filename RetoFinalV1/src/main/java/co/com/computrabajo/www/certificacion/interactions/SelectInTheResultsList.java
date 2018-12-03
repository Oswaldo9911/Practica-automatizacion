package co.com.computrabajo.www.certificacion.interactions;

// This interaction is used to click on the option I send from
// my feature. The number I get is the job offer I apply

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SelectInTheResultsList implements Interaction{

	private int option;
	private Target resultList;
		
	public SelectInTheResultsList(Target resultList, int option) {
		this.option = option;
		this.resultList=resultList;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// With resolveAllFor(actor), I can handle the target as
		// a list
		resultList.resolveAllFor(actor).get(option).click();
			
	}
	
	public static SelectInTheResultsList theOption(
			Target resultList, int option)
	{
		return Tasks.instrumented(SelectInTheResultsList.class,
				resultList, option);
	}

}
