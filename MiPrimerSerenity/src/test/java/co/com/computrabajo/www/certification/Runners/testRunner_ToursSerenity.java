package co.com.computrabajo.www.certification.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="Features/loginSerenity.feature",
glue="co.com.computrabajo.www.certification.StepsDefinitions",
plugin={"pretty","html:C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures"
		})
public class testRunner_ToursSerenity {
	
	
	
}
