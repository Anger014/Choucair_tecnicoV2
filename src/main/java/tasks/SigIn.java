package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UtestSigInPage;

public class SigIn implements Task {
    private UtestSigInPage utestSigInPage;
    public static SigIn loadSigIn() {
        return Tasks.instrumented(SigIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Open.browserOn(utestSigInPage));
    }
}
