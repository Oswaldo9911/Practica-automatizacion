package co.com.computrabajo.www.certificacion.exceptions;

//This will occur if my bad registering fails

public class BadRegistering extends AssertionError {
	
	
	public BadRegistering(String mensage, Throwable causa) {
		super(mensage, causa);
	}
}
