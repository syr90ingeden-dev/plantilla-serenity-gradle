package tasks.registrationform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.registrationform.RegistrationPageUI;

public class SelectGender implements Task {

    private final String gender;

    public SelectGender(String gender) {
        this.gender = gender;
    }

    public static SelectGender of(String gender){
        return Tasks.instrumented(SelectGender.class, gender);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //radio_button
                Click.on(RegistrationPageUI.gender(gender))
        );

    }
}
