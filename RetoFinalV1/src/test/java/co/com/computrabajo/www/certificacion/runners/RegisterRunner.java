// This runner is to try to register. It will have one unsuccesful
// test.

package co.com.computrabajo.www.certificacion.runners;

import org.junit.runner.RunWith;

//Cucumber options to load the feature and glue its steps to
//my stepsdefinitions package
import cucumber.api.CucumberOptions;
//Generate methods with the style I choose
import cucumber.api.SnippetType;
//JUnit will invoke the class I indicate in this annotation and
//will run the test in it.
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/co/com/computrabajo/www/certificacion/features/Register.feature",
		glue="co.com.computrabajo.www.certificacion.stepsdefinitions",
		snippets=SnippetType.CAMELCASE
)
public class RegisterRunner {

}
