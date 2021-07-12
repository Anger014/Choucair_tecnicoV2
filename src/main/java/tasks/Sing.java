package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SingInterface;

public class Sing implements Task {

    private String singEmail;
    private String password;

    public Sing(String singEmail,String password){
        this.singEmail=singEmail;
        this.password=password;
    }

    public static Sing form(String singEmail,String password) {
        return Tasks.instrumented(Sing.class,singEmail,password);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Enter.theValue(singEmail).into(SingInterface.INPUT_USER),
                        Enter.theValue(password).into(SingInterface.INPUT_PASS),
                        Click.on(SingInterface.CHECK_REMENBER),
                        Click.on(SingInterface.SUBMIT_BUTTON)

        );

    }
}
