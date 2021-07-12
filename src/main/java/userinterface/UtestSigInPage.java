package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://prod-auth.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F&response_type=code")
public class UtestSigInPage extends PageObject {
}
