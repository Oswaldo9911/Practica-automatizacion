package co.com.computrabajo.www.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

// If I perform a good application, then I will go to a page
// with the target I have in this class. 
// I only check if it is visible in a Question, not its content

public class GoodApplicationPage extends PageObject {

	public static final Target lblCV_SENT_MESSAGE = Target.the("the CV was sent message")
			.located(By.cssSelector(".txt_c_ok2"));
	
	
}
