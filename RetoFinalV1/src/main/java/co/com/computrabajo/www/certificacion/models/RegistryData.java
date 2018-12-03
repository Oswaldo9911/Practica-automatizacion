package co.com.computrabajo.www.certificacion.models;

// This class obtains all my information to register in 
// computrabajo

public class RegistryData {

	// this variables must be written with lower case in their
	// first char. Also, they cannot be separated by underscore
	public String name;
	public String lastnames;
	public String email;
	public String password;
	public String desiredJob;
	public String department;
	
	public RegistryData(String name, String lastnames, 
			String email, String password, 
			String desiredJob, String department) {
		this.name=name;
		this.lastnames=lastnames;
		this.email=email;
		this.password=password;
		this.desiredJob=desiredJob;
		this.department=department;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastnames() {
		return lastnames;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getDesiredJob() {
		return desiredJob;
	}
	
	public String getDepartment() {
		return department;
	}
	
}
