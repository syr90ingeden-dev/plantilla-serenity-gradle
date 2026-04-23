package userinterfaces.registrationform;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPageUI {


    public static final String DATE = "date";
    public static final Target FILE = Target.the(" ddddsddd")
            .located(By.cssSelector("div#eje")) ;
    public static final Target COUNTRY = Target.the(" fvfcd")
            .located(By.cssSelector("div..eje"));
    public static final Target FIRSTNAME = Target.the("name")
            .located(By.cssSelector("div###"));
    public static final Target LASTNAME = Target.the("name")
            .located(By.cssSelector("div###"));

    public static Target gender(String gender) {
        return Target.the("gender options")
                .located(By.cssSelector("div#eje"))
                .of(gender);
    }

    public static Target selectDate(String date) {
        return  Target.the("date option")
                .located(By.cssSelector("//"))
                .of(date);
    }
}
