package com.google.www.pages;

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

public class SearchInGooglePOM {

	WebDriver Daniel; // la necesito estatica para que sea la misma en los demas metodos.

	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		Daniel = new ChromeDriver();// Este es mi webdriver. Aca lo inicializo con ChromeDriver
		Daniel.manage().window().maximize();
	}
	
	public void goToURL(String url) {
		Daniel.get(url); // Esto es para abrir el sitio (necesito la URL con http o saca error.)

	}
	
	public void searchWord(String name, String word) {
		
		WebElement TextBox = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
		TextBox.sendKeys(word+Keys.ENTER); // Busco el elemento y presiono Enter
	}
	
	public String getTextFromWebElement(String name) {
		WebElement TextBox = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
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
		// Acá observo el manejo de etiquetas en un reporte
		// con cucumber
		sce.write("<h1> Mensaje gritado: </h1>");
		sce.write("<b> Mensaje ennegrecido: </b>");
		sce.write(" Textico suave:");
		sce.write("<p style=\"color:red;\">suave:</p>");
		sce.embed(scrFile, "image/png");
	}
	
	
}
