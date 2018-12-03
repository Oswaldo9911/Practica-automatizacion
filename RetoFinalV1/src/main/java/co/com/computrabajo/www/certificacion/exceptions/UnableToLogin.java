package co.com.computrabajo.www.certificacion.exceptions;

// This will happen if I am unable to login

public class UnableToLogin extends AssertionError {

	private static final String UNABLE_TO_LOGIN = "Unable to login";
	public static String getUnableToLoginMessage() {
		return UNABLE_TO_LOGIN;
	}
	
	public UnableToLogin(String mensage, Throwable causa) {
		super(mensage, causa);
	}
	
}
