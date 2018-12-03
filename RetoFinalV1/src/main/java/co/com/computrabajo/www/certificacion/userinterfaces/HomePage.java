package co.com.computrabajo.www.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

// Page Object with the targets of the main page

@DefaultUrl("https://www.computrabajo.com.co/")
public class HomePage extends PageObject {

	public static final Target LOGIN_NAVBAR_OPTION=Target.the("Login option in the navegation bar").located(By.id("logintoggle"));
	public static final Target txtEMAIL=Target.the("email text input").located(By.id("txEmail"));
	public static final Target txtPASSWORD=Target.the("password text field").located(By.id("txPwd"));
	public static final Target btnLOGIN=Target.the("login button").located(By.id("btnLogin"));
	public static final Target lblUSERNAME=Target.the("username").located(By.id("usernametitcan"));
	public static final Target txtSEARCH_A_JOB=Target.the("text field to search jobs").located(By.id("sq"));
	public static final Target btnSEARCH=Target.the("search button").located(By.id("search"));
	public static final Target btnREGISTER=Target.the("register option").locatedBy("//*[@id=\"logcan\"]/li[3]/a");

}
