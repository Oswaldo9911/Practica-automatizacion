package co.com.computrabajo.www.certificacion.models;
// This class is used to obtain my credentials in the login test.
public class LoginData {

	public String email;
	public String password;
	
	public LoginData(String email, String password) {
		this.email=email;
		this.password=password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
}
