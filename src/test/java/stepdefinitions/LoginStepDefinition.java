package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.User;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import questions.LoginResult;
import tasks.LoginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @Managed(driver="chrome")
    WebDriver driver;

    Actor user = Actor.named("Sayury");

    @Given("the user is on the login page")
    public void openLoginPage(){
        user.can(BrowseTheWeb.with(driver));
        user.wasAbleTo(Open.url("https://the-internet.herokuapp.com/login"));

    }

    @When("the user add valid credentials")
    public void addValidCredentials(){
        User data = new User("tomsmith","SuperSecretPassword!");
        user.attemptsTo(LoginTask.with(data));
    }

    @Then("the user should see a succesful message")
    public void validateLogin(){
        user.should(seeThat(LoginResult.isSuccesful()));
    }
}
