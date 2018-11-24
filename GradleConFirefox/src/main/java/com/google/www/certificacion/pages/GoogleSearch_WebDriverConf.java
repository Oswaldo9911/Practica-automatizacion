package com.google.www.certificacion.pages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
// Necesito esta librería para ejecutar comandos javascript
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
// Necesito OutputType y TakeScreenshot para tomar capturas
// de pantalla y almacenarlas en un ojeto tipo File.
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// Usaré el Driver de Firefox
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Necesito este método para copiar dos archivos tipo Files
import com.google.common.io.Files;

// IMPORTANTE: Esta clase fue realizada para hacer pruebas
// entre métodos estáticos y no estáticos, aplicados en dos 
// pruebas ejecutadas por una suite.
public class GoogleSearch_WebDriverConf {

	static WebDriver Daniel; // Declaro estatica. Es un atributo de la clase

	public GoogleSearch_WebDriverConf() {
		// Usare Mozilla Firefox para este ejercicio
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		Daniel = new FirefoxDriver();// Este es mi webdriver
	}

	public void openURL(String url) {

		Daniel.get(url); // Obtengo URL y voy a ella
		Daniel.manage().window().maximize();

	}

	public static void openStaticURL(String url) {

		Daniel.get(url); // Obtengo URL y voy a ella

	}

	public static void closeAllBrowsers() {

		Daniel.quit(); // Cierro todas las ventanas abiertas

	}

	public void searchWord(String name, String word) {
		// Busco el elemento, envío la cadena word
		// y presiono Enter
		Daniel.findElement(By.name(name)).
		sendKeys(word + Keys.ENTER);
		
		// Tomo captura de esta acción y la almaceno en un
		// objeto tipo File.
		File scrFile = ((TakesScreenshot) Daniel).getScreenshotAs(OutputType.FILE);
		// Creo otro objeto tipo File e indico su ubicación.
		File DestFile = new File("C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures\\screenshot2.png");

		// try-catch, donde intento copiar el archivo fuente
		// (scrFile) en el archivo destino (DestFile).
		try {
			Files.copy(scrFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Este método es estático. Usado para no tener que instanciar
	// la clase de nuevo en mi segunda búsqueda (almacenada en
	// otro test case).
	public static void searchStaticWord(String name, String word) {

		WebElement TextBox = (new WebDriverWait(Daniel, 15))
				.until(ExpectedConditions.
						presenceOfElementLocated(By.name(name)));
		TextBox.sendKeys(word);

		// Esta es la segunda captura que tomo.
		// En DestFile, puede notarse que el nombre del archivo
		// de destino es diferente. Es necesario para no
		// sobreescribir la primer captura.
		File scrFile = ((TakesScreenshot) Daniel).getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures\\screenshot.png");

		try {
			Files.copy(scrFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void openTab() {
		// Abro otra pestaña
		((JavascriptExecutor) Daniel).executeScript("window.open()");
		// Handles: atributos de ventana
		// Me dice la cantidad de ventanas que 
		// hay y las organiza en un vector dinamico
		ArrayList<String> tabs = new ArrayList<String>(Daniel.getWindowHandles()); 
		// La ventana que abra primero es la 0.
		// Voy a la pestaña 1 con la siguiente sentencia
		Daniel.switchTo().window(tabs.get(1)); 

	}

}
