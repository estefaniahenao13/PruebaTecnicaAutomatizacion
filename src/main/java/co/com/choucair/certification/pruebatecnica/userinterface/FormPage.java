package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("set name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("set lastname").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("set email").located(By.id("email"));
    public static final Target CLICK_BIRTHMONTH= Target.the("click to the list month").located(By.id("birthMonth"));
    public static final Target SELECT_BIRTHMONTH= Target.the("set birthMonth").located(By.xpath("//option[text()='June']"));
    public static final Target CLICK_BIRTHDAY= Target.the("click to the list day").located(By.id("birthDay"));
    public static final Target SELECT_BIRTHDAY= Target.the("set birthday").located(By.xpath("//option[text()='12']"));
    public static final Target CLICK_BIRTHYEAR= Target.the("click to the list year").located(By.id("birthYear"));
    public static final Target SELECT_BIRTHYEAR= Target.the("set birthyear").located(By.xpath("//option[@value='number:1999']"));
    public static final Target INPUT_LANGUAGES= Target.the("set languages").located(By.xpath("//input[@type=\"search\"]"));
    public static final Target CLICK_BUTTONUBICATION= Target.the("click boton for more information").located(By.xpath("//a[@role='button']"));

    public static final Target INPUT_CITY = Target.the("set city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("set zip").located(By.id("zip"));
    public static final Target CLICK_COUNTRY= Target.the("click to the list country").located(By.xpath("//div[@name=\"countryId\"]"));
    public static final Target SELECT_COUNTRY= Target.the("set country").located(By.xpath("//div[text()='Colombia']"));
    public static final Target CLICK_BUTTONDEVICES= Target.the("click boton for more information- devices").located(By.xpath("(//a[@role='button'])[1]"));

    public static final Target CLICK_COMPUTER= Target.the("click to the list computers").located(By.xpath("//div[@name='osId']"));
    public static final Target SELECT_COMPUTER = Target.the("set computer").located(By.xpath("//div[text()='Windows']"));
    public static final Target CLICK_VERSION= Target.the("click to the list version").located(By.xpath("//div[@name='osVersionId']"));
    public static final Target SELECT_VERSION = Target.the("set version").located(By.xpath("//div[text()='XP']"));
    public static final Target CLICK_LANGUAGE= Target.the("click to the list language").located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target SELECT_LANGUAGE = Target.the("set language").located(By.xpath("//div[text()='Spanish']"));
    public static final Target CLICK_MOVIL= Target.the("click to the list moviles").located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target SELECT_MOVIL = Target.the("set movil").located(By.xpath("//div[text()='Apple']"));
    public static final Target CLICK_MODEL= Target.the("click to the list models").located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target SELECT_MODEL = Target.the("set model").located(By.xpath("//div[text()='iPhone 4']"));
    public static final Target CLICK_OPERATING_SYSTEM= Target.the("click to the list operative systems").located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target SELECT_OPERATING_SYSTEM = Target.the("set model operative system").located(By.xpath("//div[text()='iOS 11.2']"));
    public static final Target CLICK_BUTTONLASTSTEP= Target.the("click boton last step").located(By.xpath("(//a[@role='button'])[1]"));

    public static final Target INPUT_NEWPASSWORD= Target.the("create to the new password").located(By.id("password"));
    public static final Target INPUT_CONFIRMNEWPASSWORD= Target.the("create to the new password").located(By.id("confirmPassword"));
    public static final Target CLICK_CHECKBOX1= Target.the("click to the checkbox1").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target CLICK_CHECKBOX2= Target.the("click to the checkbox2").located(By.xpath("(//label/span)[4]"));
    public static final Target CLICK_BUTTONCOMPLETESETUP= Target.the("click boton last step").located(By.id("laddaBtn"));
}
