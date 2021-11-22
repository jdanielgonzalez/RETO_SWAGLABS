package co.com.sofka.userinterface.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Login extends PageObject {

    public static final Target USER_NAME = Target.
            the("user name").located(id("user-name"));

    public static final Target PASSWORD = Target.
            the("password").located(id("password"));

    public static final Target BTN_LOGIN = Target.
            the("button login").located(id("login-button"));

    public static final Target ERROR_MESSAGE = Target.
            the("message error").located(xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3\n"));
}
