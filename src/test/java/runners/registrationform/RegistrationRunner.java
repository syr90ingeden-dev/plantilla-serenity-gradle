package runners.registrationform;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrationform.feature",
        glue = "stepdefinitions/registrationform",
        tags = "@register")
public class RegistrationRunner {
}
