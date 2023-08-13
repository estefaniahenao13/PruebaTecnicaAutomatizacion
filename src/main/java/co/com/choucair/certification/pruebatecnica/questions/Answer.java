package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.userinterface.ConfirmationEmailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<String> {
    public static Question<String> value(){
        return new Answer();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ConfirmationEmailPage.CONFIRM_MENSAGE).getText();
    }
}
