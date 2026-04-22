package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.DropdownPage;

public class SelectOption implements Task {

    private final int index;

    public SelectOption(int index) {
        this.index = index;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectFromOptions.byIndex(index).from(DropdownPage.DROPDOWN)
        );
    }

       private static SelectOption byIndex(int index) {
        return Tasks.instrumented(SelectOption.class, index);
    }
}
