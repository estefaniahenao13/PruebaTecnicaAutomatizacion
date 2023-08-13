package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Complete implements Task {
    private final String username;
    private final String lastname;
    private final String email;
    private final String language;
    private final String city;
    private final String zip;
    private final String password;
    private final String confirmpassword;



    public Complete(String username, String lastname, String email, String language, String city, String zip, String password, String confirmpassword) {
        this.username = username;
        this.lastname = lastname;
        this.email = email;
        this.language = language;
        this.city = city;
        this.zip = zip;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public static Complete withCredentials(String username, String lastname, String email, String language,String city, String zip, String password, String confirmpassword ){
        return instrumented(Complete.class, username, lastname, email, language,city, zip, password, confirmpassword);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(FormPage.INPUT_USERNAME));
        actor.attemptsTo(Enter.theValue(lastname).into(FormPage.INPUT_LASTNAME));
        actor.attemptsTo(Enter.theValue(email).into(FormPage.INPUT_EMAIL));
        actor.attemptsTo(Click.on(FormPage.CLICK_BIRTHMONTH));
        actor.attemptsTo(Click.on(FormPage.SELECT_BIRTHMONTH));
        actor.attemptsTo(Click.on(FormPage.CLICK_BIRTHDAY));
        actor.attemptsTo(Click.on(FormPage.SELECT_BIRTHDAY));
        actor.attemptsTo(Click.on(FormPage.CLICK_BIRTHYEAR));
        actor.attemptsTo(Click.on(FormPage.SELECT_BIRTHYEAR));
        actor.attemptsTo(Enter.theValue(language).into(FormPage.INPUT_LANGUAGES));
        actor.attemptsTo(Click.on(FormPage.CLICK_BUTTONUBICATION));

        actor.attemptsTo(Enter.theValue(city).into(FormPage.INPUT_CITY));
        actor.attemptsTo(Enter.theValue(zip).into(FormPage.INPUT_ZIP));
        actor.attemptsTo(Click.on(FormPage.CLICK_COUNTRY));
        actor.attemptsTo(Click.on(FormPage.SELECT_COUNTRY));
        actor.attemptsTo(Click.on(FormPage.CLICK_BUTTONDEVICES));

        actor.attemptsTo(Click.on(FormPage.CLICK_COMPUTER));
        actor.attemptsTo(Click.on(FormPage.SELECT_COMPUTER));
        actor.attemptsTo(Click.on(FormPage.CLICK_VERSION));
        actor.attemptsTo(Click.on(FormPage.SELECT_VERSION));
        actor.attemptsTo(Click.on(FormPage.CLICK_LANGUAGE));
        actor.attemptsTo(Click.on(FormPage.SELECT_LANGUAGE));
        actor.attemptsTo(Click.on(FormPage.CLICK_MOVIL));
        actor.attemptsTo(Click.on(FormPage.SELECT_MOVIL));
        actor.attemptsTo(Click.on(FormPage.CLICK_MODEL));
        actor.attemptsTo(Click.on(FormPage.SELECT_MODEL));
        actor.attemptsTo(Click.on(FormPage.CLICK_OPERATING_SYSTEM));
        actor.attemptsTo(Click.on(FormPage.SELECT_OPERATING_SYSTEM));
        actor.attemptsTo(Click.on(FormPage.CLICK_BUTTONLASTSTEP));

        actor.attemptsTo(Enter.theValue(password).into(FormPage.INPUT_NEWPASSWORD));
        actor.attemptsTo(Enter.theValue(confirmpassword).into(FormPage.INPUT_CONFIRMNEWPASSWORD));
        actor.attemptsTo(Click.on(FormPage.CLICK_CHECKBOX1));
        actor.attemptsTo(Click.on(FormPage.CLICK_CHECKBOX2));
        actor.attemptsTo(Click.on(FormPage.CLICK_BUTTONCOMPLETESETUP));

    }
}
