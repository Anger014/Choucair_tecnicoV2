package userinterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UtestSigIn implements Task {

    public static UtestSigIn sigIn() {
        return Tasks.instrumented(UtestSigIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
