package co.com.choucair.certification.pruebatecnica.stepdefinitions;


import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.Complete;
import co.com.choucair.certification.pruebatecnica.tasks.LogIn;
import co.com.choucair.certification.pruebatecnica.tasks.OpenUp;
import co.com.choucair.certification.pruebatecnica.tasks.Register;
import co.com.choucair.certification.pruebatecnica.userinterface.ConfirmationEmailPage;
import co.com.choucair.certification.pruebatecnica.userinterface.FormPage;
import cucumber.api.java.Before;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {
    @Before
    public void setStge(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the user navigates to the registration page$")
    public void theuserNavigatesToTheRegistrationPage() {
        OnStage.theActorCalled("Estefania").wasAbleTo(OpenUp.thePage(), (Register.onThePage()));
    }

    @When("^enters his personal data$")
    public void entersHisPersonalData() {
        OnStage.theActorCalled("Estefania").attemptsTo(Complete.withCredentials("estefania", "henao", "laliv22178@viperace.com\n" +
                        "\n",
                "croata", "Sabaneta", "055450" , "12345Hec**ES123", "12345Hec**ES123"));
    }

    @And("^log in$")
    public void logIn() {
        OnStage.theActorCalled("Estefania").attemptsTo(LogIn.withCredentials("laliv22178@viperace.com", "12345Hec**ES123"));
    }

    @Then("^the user can see a message to confirm his email$")
    public void theUserCanSeeAMessageToConfirmHisEmail() {
        System.out.println(Answer.value().answeredBy(theActorInTheSpotlight()));
    }

}





