package tasks.registrationform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterfaces.registrationform.RegisterPage;
import userinterfaces.registrationform.RegistrationPageUI;

import java.util.Map;

import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.actions.Click.on;

public class EnterPersonalInfo implements Task {

    private final Map<String, String> data;

    public EnterPersonalInfo(Map<String, String> data) {
        this.data = data;
    }

    public static EnterPersonalInfo with(Map<String, String> data) {
        return  Tasks.instrumented(EnterPersonalInfo.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                //inputs
                theValue(data.get("firstname")).into(RegistrationPageUI.FIRSTNAME),
                theValue(data.get("lastname")).into(RegistrationPageUI.LASTNAME)
        );

    }
}
