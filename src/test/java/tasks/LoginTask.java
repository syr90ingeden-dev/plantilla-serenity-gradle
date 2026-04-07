package tasks;

import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;

public class LoginTask implements Task {

    private final User user;

    public LoginTask(User user) {
        this.user = user;
    }

    public static LoginTask with(User user) {
        return Tasks.instrumented(LoginTask.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUsername()).into(LoginPage.USERNAME),
                Enter.theValue(user.getPassword()).into(LoginPage.PASSWORD),
               Click.on(LoginPage.LOGGIN_BUTTON)
        );
    }
}
