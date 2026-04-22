package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME = Target.the("username")
            .located(By.cssSelector("input#username"));
    public static final Target PASSWORD = Target.the("password")
            .located(By.cssSelector("input#password"));
    public static final Target LOGGIN_BUTTON = Target.the("button")
            .located(By.cssSelector("button[type='submit']"));
    public static final Target SUCCES_MESSAGE= Target.the("message")
            .located(By.cssSelector("div#flash.flash.success"));
}