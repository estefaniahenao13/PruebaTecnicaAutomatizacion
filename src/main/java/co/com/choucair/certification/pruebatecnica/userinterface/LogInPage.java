package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogInPage {
    public static final Target CLICK_LOGIN = Target.the("click log in").located(By.xpath("(//a[text()='Log In'])[1]"));
    public static final Target INPUT_EMAIL = Target.the("set email").located(By.id("username"));
    public static final Target INPUT_PASSWORD= Target.the("set the password").located(By.id("password"));
    public static final Target CLICK_BUTTON_SINGIN = Target.the("click sing in").located(By.id("kc-login"));

}
