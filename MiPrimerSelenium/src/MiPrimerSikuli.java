import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Para el try-catch necesario por si no encuentra los objetos
import org.sikuli.script.FindFailed; 
//Es el tipo de imagen que voy a buscar.
import org.sikuli.script.Pattern; 
//Representacion de monitor real. Sikuli necesita un monitor conectado.
import org.sikuli.script.Screen;

import com.google.common.io.Files; 

public class MiPrimerSikuli {

	public static void main(String[] args) {
		
		//Inicializamos driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Daniel= new ChromeDriver();//Este es mi webdriver
		//Inicializamos pantalla
		Screen s = new Screen();
		//Obtengo las imagenes de los elementos web con los que voy a interactuar.
		Pattern InputTextBox = new Pattern("C:\\Users\\SBMEDADMIN\\Pictures\\SikulixPhotos\\txtSearch.png");
        Daniel.get("https://www.google.com/"); // Voy a la URL de Google
        Daniel.manage().window().maximize();
        Pattern AhoraNo=new Pattern("C:\\Users\\SBMEDADMIN\\Pictures\\SikulixPhotos\\AhoraNo.png");
        Pattern btnSearchText = new Pattern("C:\\Users\\SBMEDADMIN\\Pictures\\SikulixPhotos\\btnSearchText.png");
        // Try-catch por si no encuentra el elemento.
        try {
			s.click(InputTextBox);
			s.write("Suso");
			s.click(AhoraNo);
			s.click(btnSearchText);
			
			File scrFile = ((TakesScreenshot)Daniel).getScreenshotAs(OutputType.FILE);
			 File DestFile=new File("C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures\\screenshot.png");
			// Now you can do whatever you need to do with it, for example copy somewhere
	        //Copy file at destination
	        try {
				Files.copy(scrFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Pattern CurrentScreen = new Pattern("C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures\\screenshot.png");
	        Pattern actual = new Pattern("C:\\Users\\SBMEDADMIN\\Pictures\\SikulixPhotos\\actual.png");

	        if(CurrentScreen==actual) {
	        	System.out.println("Son iguales");
	        }
			
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
        
        
        
        
	}

}
