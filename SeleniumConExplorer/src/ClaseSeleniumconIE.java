// Imports
import org.openqa.selenium.WebDriver; // Usar� la clase webdriver para manipular mi navegador
import org.openqa.selenium.ie.InternetExplorerDriver; // Selecciono el controlador de IE
import org.openqa.selenium.By; // Para localizar por algo (id, name, xpath, etc.)
import org.openqa.selenium.Keys; // Para enviar teclas

public class ClaseSeleniumconIE {

	public static void main(String[] args) {

		// Ubico el controlador
		// Esta vez ubico el controlador de IE
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_3.141.0\\IEDriverServer.exe");
		WebDriver Daniel = new InternetExplorerDriver();// Este es mi webdriver

		// -------------------------------------------------------
		// Hasta este punto, he logrado abrir el navegador IE.

		// PASO 3: Poner URL con protocolo
		Daniel.get("http://www.google.com"); // Esto es para abrir el sitio (necesito la URL con http o saca error.)

		// PASO 4: Valor a buscar

		Daniel.findElement(By.id("lst-ib")).sendKeys("Suso");
		// finElement es para encontrar el elemento web
		// By.* es para indicar el criterio de b�squeda
		// sendKeys es para enviar datos a ese elemento
		
		// Si quiero hacer click en el bot�n de buscar y que no me salga excepci�n por la lista desplegable
		// de Chrome, entonces env�o la tecla Escape y luego un click.
		
		Daniel.findElement(By.id("lst-ib")).sendKeys(Keys.ESCAPE);
		Daniel.findElement(By.name("btnK")).click();
		
		// Otra opci�n es enviar un Enter a la caja de texto donde escrib� Suso.
		//Daniel.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);

	}

}
