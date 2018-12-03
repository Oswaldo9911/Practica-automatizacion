package co.com.computrabajo.www.certificacion.tasks;

import java.util.List;

import co.com.computrabajo.www.certificacion.interactions.SelectTheDepartment;
import co.com.computrabajo.www.certificacion.models.RegistryData;
import co.com.computrabajo.www.certificacion.userinterfaces.RegistryForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
// This task will try to register me in computrabajo.
public class Register implements Task {

	List<RegistryData> data;
	
	public Register(List<RegistryData> data) {
		this.data=data;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(data.get(0).getName()).
				into(RegistryForm.txtNAME),
				Enter.theValue(data.get(0).getLastnames()).
				into(RegistryForm.txtLASTNAMES),
				Enter.theValue(data.get(0).getEmail()).
				into(RegistryForm.txtEMAIL),
				Enter.theValue(data.get(0).getPassword()).
				into(RegistryForm.txtPASSWORD),				
				Enter.theValue(data.get(0).getDesiredJob()).
				into(RegistryForm.txtDESIRED_POSITION),
				Click.on(RegistryForm.ddlDEPARTMENT),
				SelectTheDepartment.named(data.
						get(0).getDepartment(),
						RegistryForm.optsDEPARTMENT),
				Click.on(RegistryForm.btnREGISTER));
	}

	public static Register inThePage(List<RegistryData> data) {
		return new Register(data);
	}
}
