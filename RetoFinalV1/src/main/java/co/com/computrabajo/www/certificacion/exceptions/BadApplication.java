package co.com.computrabajo.www.certificacion.exceptions;

// This will occur if I perform a bad application to a job offer
// in computrabajo

public class BadApplication extends AssertionError {

	public BadApplication(String mensage, Throwable causa) {
		super(mensage, causa);
	}
	
}
