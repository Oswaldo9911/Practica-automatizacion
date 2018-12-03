package co.com.computrabajo.www.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

// When I go to the page of any Job,
// this button will be present and visible. This is what
// I use to apply.

public class JobPage extends PageObject {

	public static final Target btnAPPLY = Target.the("apply button")
			.located(By.id("applicatedDesktop3"));
}
