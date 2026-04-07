package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickElement implements Interaction {

    private final Target target;

    public ClickElement(Target target) {
        this.target = target;
    }

    public static Click on(Target target){
        return new Click();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(net.serenitybdd.screenplay.actions.Click.on(target));
    }
}
