package com.google.mail.certification.pages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class GmailComposeAndSendMail {

  WebDriver Daniel;
	
	public GmailComposeAndSendMail(WebDriver Daniel, String BrowserDriver, String BrowserDriverPath) {
		this.Daniel=Daniel;
		System.setProperty(BrowserDriver, BrowserDriverPath);
		this.Daniel=new ChromeDriver();
		// Este es mi webdriver. Aca lo inicializo con ChromeDriver
		this.Daniel.manage().window().maximize();
		
	}
	
	public void switchWindow() {
		ArrayList<String> tabs = new ArrayList<String>(Daniel.getWindowHandles()); //Handles: atributos de ventana
		//Me dice la cantidad de ventanas que hay y las organiza en un vector dinamico
		//La ventana que abra primero es la 0. {Confirmar si la 0 es default}
		Daniel.switchTo().window(tabs.get(0)); //voy al tab 1
	}
	
	public void openURL(String url) {

		// Obtengo URL y voy a ella
		Daniel.get(url);

	}
	
	
	public WebElement searchElementByXPath(String xpath) {
		
		WebElement ElementByXPath = (new WebDriverWait(Daniel, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
		return ElementByXPath;
		
	}
	
	public void writeDataOnWebElement(WebElement elemento, String data) {
		
		elemento.sendKeys(data);
	
	}
	
	public void clickOnWebElement(WebElement elemento) {
		
		elemento.click();
	
	}
	
	public void takeScreenshot(String Destino) {
		File scrFile = ((TakesScreenshot) Daniel).getScreenshotAs(OutputType.FILE);
		File DestFile = new File(Destino);

		try {
			Files.copy(scrFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Función para cerrar el navegador donde esté el WebDriver
	public void closeBrowser() {

		Daniel.close();

	}
	
	// Función para cerrar todos los 
	//navegadores y cerrar la sesión del WebDriver
	public void closeAllBrowsers() {

		Daniel.quit();

	}
	
}
