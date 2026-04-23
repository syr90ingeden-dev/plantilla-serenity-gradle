package tasks.registrationform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.registrationform.RegistrationPageUI;

import java.util.Calendar;

public class SelectDate implements Task {

    private final String date;

    public SelectDate(String date) {
        this.date = date;
    }

    public static SelectDate of(String date){
        return Tasks.instrumented(SelectDate.class,date);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistrationPageUI.DATE),
                Click.on(RegistrationPageUI.selectDate(date))
        );

    }
}
