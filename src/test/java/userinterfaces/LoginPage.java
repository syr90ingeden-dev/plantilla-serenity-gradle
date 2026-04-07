package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME = Target.the("username")
            .located(By.id("username"));
    public static final Target PASSWORD = Target.the("password")
            .located(By.id("password"));
    public static final Target LOGGIN_BUTTON = Target.the("button")
            .located(By.cssSelector("button[type='submit']"));
    public static final Target SUCCES_MESSAGE= Target.the("message")
            .located(By.id("flash"));
}
