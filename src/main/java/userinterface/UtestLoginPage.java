package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtestLoginPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Button to join Utest form").located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_FIRST_NAME = Target.the("Input for name").located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Input for last_name").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Input for email").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[3]/input"));

    public static final Target SELECT_MONTH = Target.the("List to select month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("List to select day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("List to select year").located(By.cssSelector("select#birthYear"));

    public static final Target NEXT_BUTTON_LOCATION = Target.the("Button to go location form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target INPUT_CITY = Target.the("Input for city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Input for zip").located(By.id("zip"));

    public static final Target NEXT_BUTTON_DEVICES = Target.the("button to go devices form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target Search_device_OS = Target.the("search device os").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));
    public static final Target Search_device_version = Target.the("Search device version").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    public static final Target Search_device_language = Target.the("Search device language").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));

    public static final Target NEXT_BUTTON_LAST = Target.the("button to go last form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_PASSWORD = Target.the("Input for PASS").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input TO CONFIRM PASS").located(By.id("confirmPassword"));

    public static final Target CHECK_INFORMED = Target.the("Check optional").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/input"));
    public static final Target CHECK_UTEST_TERMS = Target.the("Check to confirm terms").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/input"));
    public static final Target CHECK_PRIVACY = Target.the("Check to confirm privacy").located(By.id("privacySetting"));

    public static final Target NEXT_BUTTON_COMPLETE = Target.the("button to go complete form").located(By.id("laddaBtn"));









}
