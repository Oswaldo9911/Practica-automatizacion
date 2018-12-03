package co.com.computrabajo.www.certificacion.interactions;
// This interaction selects the department where I want to search
// a job. Currently, it only chooses Antioquia.

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTheDepartment implements Interaction {

	private String department;
	private Target dropdownlist;
	private int ddlvalue;

	public SelectTheDepartment(String department, Target optsdepartment) {

		this.department = department;
		this.dropdownlist = optsdepartment;
		
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		for (int i = 0; i < dropdownlist.resolveAllFor(actor).size(); i++) {
			// The options are identified by their values.
			if (dropdownlist.resolveAllFor(actor).get(i).
					getValue().toString().contains("2")) {
				dropdownlist.resolveAllFor(actor).get(i).click();
				break;
			}

		}
	}

	public static Performable named(String department, Target optsdepartment) {
		return new SelectTheDepartment(department, optsdepartment);
	}

}
