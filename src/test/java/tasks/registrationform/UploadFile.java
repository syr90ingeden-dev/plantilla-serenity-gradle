package tasks.registrationform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Upload;
import userinterfaces.registrationform.RegistrationPageUI;

import java.nio.file.Paths;

public class UploadFile implements Task {

    private final String path;

    public UploadFile(String path) {
        this.path = path;
    }

    public static UploadFile from(String path){
        return Tasks.instrumented(UploadFile.class, path);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Upload.theFile(Paths.get(path)).to(RegistrationPageUI.FILE)
        );

    }
}
