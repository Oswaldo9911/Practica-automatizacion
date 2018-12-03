package co.com.cinemark.www.certification.pages.tasks;

import co.com.cinemark.www.certification.pages.userinterfaces.CinemarkMovies;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Buscar implements Task {
	
	 CinemarkMovies cinemarkMovies;

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(cinemarkMovies.PELICULA));
	}
	
	public static Buscar TheMovie(String pelicula) {
		return Tasks.instrumented(Buscar.class, pelicula);
	}

}
