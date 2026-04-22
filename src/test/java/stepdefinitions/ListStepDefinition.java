package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import tasks.SelectOption;

public class ListStepDefinition {

    @Managed(driver="chrome")
    WebDriver driver;

    Actor user = Actor.named("Sayury");

    @Given("the user navigates to the dropdown list")
    public void userNavigateToTheDropdownList(){
        user.can(BrowseTheWeb.with(driver));
        user.wasAbleTo(Open.url("https://the-internet.herokuapp.com/dropdown"));
    }

    @When("the user selects the first option")
    public void selectFirstOption(){
        OnStage.theActorInTheSpotlight()
                .attemptsTo();

    }

    @Then("the user should see the first selected item")
    public void userShouldSeeFirstItemSelected(){

    }
}
