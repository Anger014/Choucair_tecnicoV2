package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingInterface extends PageObject {
    public static final Target INPUT_USER = Target.the("Input to add username").located(By.id("username"));
    public static final Target INPUT_PASS = Target.the("Input to add password").located(By.id("password"));
    public static final Target CHECK_REMENBER = Target.the("CHECK REMEMBER ME").located(By.id("rememberMe"));
    public static final Target SUBMIT_BUTTON = Target.the("SUBMIT").located(By.id("kc-login"));


}
