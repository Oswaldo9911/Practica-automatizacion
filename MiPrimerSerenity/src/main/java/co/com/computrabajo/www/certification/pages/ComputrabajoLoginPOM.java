package co.com.computrabajo.www.certification.pages;

// I need WebElements from selenium to interact with the web page.
import org.openqa.selenium.WebElement;

// These are my libraries from serenity
// A Page Object Encapsulates my interactions with a web page.
// My WebDriver implementation and my WebElements are hidden in this Page Object.
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
//With the next library, I use the annotation @DefaultUrl to go to my website.
import net.thucydides.core.annotations.DefaultUrl;

// My DefaultUrl is computrabajo, where I will Log in.
@DefaultUrl("https://www.computrabajo.com.co/")
public class ComputrabajoLoginPOM extends PageObject {
	
	//Mapping of my web page. Here I get all my WebElements. With the
	// @FindBy annotation I specify if I'm going to find them by xpath, id, name, etc.
	@FindBy(id="txEmail")
	WebElement txtemail;
	
	@FindBy(id="txPwd")
	WebElement txtpassword;
	
	@FindBy(id="logintoggle")
	WebElement navbarloginoption;
	
	@FindBy(id="btnLogin")
	WebElement btnlogin;

	// Write data in the text fields
	public void writeData(String email, String password) {
		txtemail.sendKeys(email);
		txtpassword.sendKeys(password);
	}
	
	// Click on Log In option in the navegation bar (also called navbar)
	// This is necessary to make visible the text fields of the writeData() method.
	public void clickOnLoginOption() {
		// TODO Auto-generated method stub
		navbarloginoption.click();
	}
	
	// Click on log in button.
	public void clickOnLoginButton() {
		// TODO Auto-generated method stub
		btnlogin.click();
	}

}
