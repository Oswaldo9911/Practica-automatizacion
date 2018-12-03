package co.com.cinemark.www.certification.pages.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.cinemark.com.co/peliculas?tag=790")
public class CinemarkMovies extends PageObject {
	
	public static final Target PELICULA = Target.the("Seleccionar pelicula").located(By.xpath("//*[text()=\"Una entrevista con Dios\"]"));
	

}
