package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DropdownPage {

    public static final Target DROPDOWN = Target.the("OptionList")
            .located(By.cssSelector(" "));
}
