package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

public class MyNewPOM {
	WebDriver Daniel; // la necesito estatica para que sea la misma en los demas metodos.

	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		Daniel = new ChromeDriver();// Este es mi webdriver. Aca lo inicializo con ChromeDriver
		Daniel.manage().window().maximize();
	}
	
	public void goToURL(String url) {
		Daniel.get(url); // Esto es para abrir el sitio (necesito la URL con http o saca error.)

	}
	
	public void searchWord(String id, String word) {
		
		WebElement TextBox = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
		TextBox.sendKeys(word+Keys.ENTER); // Busco el elemento y presiono Enter
	}
	
	public String getTextFromWebElement(String id) {
		WebElement TextBox = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
		String Texto=TextBox.getText();
		return Texto;
	}
	
	public String getTitleFromWebPage() {
		return Daniel.getTitle();
	}
	
	public void closeBrowser() {

		Daniel.close(); // Cierro el navegador

	}
	
	public void takeScreenshot(Scenario sce) {
		byte[] scrFile = ((TakesScreenshot) Daniel).getScreenshotAs(OutputType.BYTES); // Take screenshot and save on temporary file.
		sce.write("<h1> Mensaje gritado: </h1>");
		sce.write("<b> Mensaje ennegrecido: </b>");
		sce.write(" Textico suave:");
		sce.write("<p style=\"color:red;\">suave:</p>");
		sce.embed(scrFile, "image/png");
	}
	
	public void writeOnElementByName(String name, String Text) {

		WebElement ElementByName = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
		ElementByName.sendKeys(Text);


	}
	
	public void clickOnLoginButton() {
		WebElement Button = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("ingresarBtn")));
		Button.click();
	}

}
