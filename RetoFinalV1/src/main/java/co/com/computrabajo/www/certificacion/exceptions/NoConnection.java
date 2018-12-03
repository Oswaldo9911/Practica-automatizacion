package co.com.computrabajo.www.certificacion.exceptions;

// This will happen if I lose my connection when I begin the test

public class NoConnection extends AssertionError {

	public NoConnection(String mensage, Throwable causa) {
		super(mensage, causa);
	}
	
}
