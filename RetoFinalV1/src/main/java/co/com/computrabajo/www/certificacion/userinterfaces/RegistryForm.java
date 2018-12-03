package co.com.computrabajo.www.certificacion.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

// Page Object with the targets of the registry form in
// computrabajo

public class RegistryForm extends PageObject {

	public static final Target txtNAME=Target.
			the("name input text").
			located(By.id("AccessModel_Name"));
	public static final Target txtLASTNAMES=Target.
			the("lastnames input text").
			located(By.id("AccessModel_SurName"));
	public static final Target txtEMAIL=Target.
			the("email input text").
			located(By.id("AccessModel_Email"));
	public static final Target txtPASSWORD=Target.
			the("password input text").
			located(By.id("AccessModel_Password"));
	public static final Target txtDESIRED_POSITION=Target.
			the("desired position input text").
			located(By.id("AccessModel_Cargo"));
	public static final Target ddlDEPARTMENT=Target.
			the("department dropdown list").
			located(By.id("AccessModel_LocationId"));
	public static final Target optsDEPARTMENT=Target.
			the("department dropdown list options").
			located(By.tagName("option"));
	public static final Target btnREGISTER=Target.
			the("button to continue with the registry").
			located(By.id("sbStep1"));
	
	public static final Target lblNAME_IS_MANDATORY=Target.
			the("error message by empty name").
			located(By.id("AccessModel_Name-error"));
	
	public static final Target lblEMAIL_IS_MANDATORY=Target.
			the("error message by empty email").
			located(By.id("AccessModel_Email-error"));
	
}
