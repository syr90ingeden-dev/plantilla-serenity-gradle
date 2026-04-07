package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.BooleanQuestionConsequence;
import net.serenitybdd.screenplay.Question;
import org.htmlunit.xpath.operations.Bool;
import userinterfaces.LoginPage;

public class LoginResult implements Question<Boolean>{

    public static Question<Boolean> isSuccesful() {
        return new LoginResult();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPage.SUCCES_MESSAGE.resolveFor(actor)
                .getText()
                .contains("You logged into a secure area!");
    }
}
