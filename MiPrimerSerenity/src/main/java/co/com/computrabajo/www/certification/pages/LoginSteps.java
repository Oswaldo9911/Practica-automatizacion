package co.com.computrabajo.www.certification.pages;

// With the annotation @Step, I will indicate which method will appear in the report
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	
	// I instantiate my POM as loginPOM
	ComputrabajoLoginPOM loginPOM=new ComputrabajoLoginPOM();
	
	// This is the information I'm going to send to the webpage
	String email="ingdavidayala1996@gmail.com";
	String password="dag1996";

	@Step("Open Chrome")
	public void openApplication() {
		// .open() is a Page Object method. I will use it to open the
		// webpage specified in the @DefaultUrl of ComputrabajoLoginPOM
		loginPOM.open(); 
	}
	
	@Step("Click on Log in option")
	public void writeData() {
		// Click on Log In option in the navegation bar (also called navbar) 
		loginPOM.clickOnLoginOption();
	}
	
	@Step("Send data and click on log in button")
	public void sendData() {
		// Write data in the text fields
		loginPOM.writeData(email,password);
		// Click on log in button.
		loginPOM.clickOnLoginButton();
	}
	
	
	
}
