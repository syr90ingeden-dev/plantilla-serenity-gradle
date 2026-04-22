package stepdefinitions.registrationform;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import org.openqa.selenium.WebDriver;
import userinterfaces.registrationform.RegisterPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;
import java.util.Map;

public class RegistrationFormStepdef {

    @Managed(driver="chrome")
    WebDriver driver;

    Actor actor = Actor.named("Sayury");

    @Given("the actor navigates to the registration page")
    public void openRegistratioPage(){
        theActorInTheSpotlight().wasAbleTo(
                Open.browserOn().the(RegisterPage.class)
        );
    }

    @When("the actor enters personal information")
    public void enterPersonalInformation(List<Map<String,String>>  data){
        Map<String, String> user =  data.get(0);

        actor.attemptsTo(
        );
    }
    @And("selects gender {string}")
    public void selectGenderOption(){

    }

    @And ("enters mobileNumber {string}")
    public void enterMobileNumber(){

    }
    @And ("selects DateofBirth {string}")
    public void selectDateBirth(){

    }
    @And ("enters Subjects test {string}")
    public void enterSubject(){

    }
    @And ("check Sports {string}")
    public void checkSports(){

    }
    @And ("uploads file {string}")
    public void uploadFile(){

    }
    @And("submits the form")
    public void submitForm(){

    }
    @Then("the actor should see successful message")
    public void shouldSeeMessahe(){

    }
}
