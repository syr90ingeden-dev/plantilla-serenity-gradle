package tasks.registrationform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.registrationform.RegistrationPageUI;

import static org.apache.xmpbox.schema.PhotoshopSchema.COUNTRY;

public class SelectCountry implements Task {

    private final String country;

    public SelectCountry(String country) {
        this.country = country;
    }

    public SelectCountry of (){
        return Tasks.instrumented(SelectCountry.class, country);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(country).from(RegistrationPageUI.COUNTRY)
        );

    }
}
