package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrationPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button showing registration form").located(By.className("unauthenticated-nav-bar__sign-up"));
}
