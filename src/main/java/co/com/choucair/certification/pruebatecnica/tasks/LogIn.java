package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {
    private final String email;
    private final String password;

    public LogIn(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static LogIn withCredentials(String email, String password) {
        return instrumented(LogIn.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LogInPage.CLICK_LOGIN));
        actor.attemptsTo(Enter.theValue(email).into(LogInPage.INPUT_EMAIL));
        actor.attemptsTo(Enter.theValue(password).into(LogInPage.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(LogInPage.CLICK_BUTTON_SINGIN));


    }
}
