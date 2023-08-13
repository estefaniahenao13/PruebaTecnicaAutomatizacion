package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmationEmailPage extends PageObject {
    public static By CONFIRM_MENSAGE = By.xpath("(//section[@class='auth-section']/div[@class='instructions'])[2]");

}
