package co.com.computrabajo.www.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

// When I search a new job, I get results with a title with
// the class tO. This is what I use to obtain all those offers
// and save them in one simple target.
// In other Task, I use the interaction SelectInTheResultsList
// to obtain the job I wish

public class SearchResult extends PageObject {

	public static final Target JOB = Target.the("the job I want")
			.located(By.cssSelector(".tO"));
	
}
