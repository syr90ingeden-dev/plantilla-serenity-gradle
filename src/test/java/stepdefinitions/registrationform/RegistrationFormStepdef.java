package stepdefinitions.registrationform;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import tasks.registrationform.EnterPersonalInfo;

import java.util.List;
import java.util.Map;

public class RegistrationFormStepdef {

    @Managed(driver="chrome")
    WebDriver driver;

    Actor actor = Actor.named("Sayury");

    @Given("the user navigates to the registration page")
    public void openRegistratioPage(){
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(
                Open.url("https://demoqa.com/automation-practice-form")
        );
    }

    @When("the user enters personal information:")
    public void enterPersonalInformation(List<Map<String,String>>  data){
        Map<String, String> user =  data.get(0);

        actor.attemptsTo(
                EnterPersonalInfo.with(user)
        );
    }
    @When("selects gender {string}")
    public void selectGenderOption(){

    }

    @When ("enters mobileNumber {string}")
    public void enterMobileNumber(){

    }
    @When ("selects DateofBirth {string}")
    public void selectDateBirth(){

    }
    @When ("enters Subjects test {string}")
    public void enterSubject(){

    }
    @When ("check Sports {string}")
    public void checkSports(){

    }
    @When ("uploads file {string}")
    public void uploadFile(){

    }
    @When("submits the form")
    public void submitForm(){

    }
    @Then("the actor should see successful message")
    public void shouldSeeMessahe(){

    }
}
