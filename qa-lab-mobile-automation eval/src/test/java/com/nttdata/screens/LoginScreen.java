package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private  WebElement usernameinput;

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement passwordinput;
    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement loginbutton;

    @AndroidFindBy(xpath ="//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup")
    private WebElement principal;

    //Se pone un tiempo de espera para que termine de cargar la aplicacion y las animaciones respectivas antes de ingresar los datos
    public void timeoutclickuserinput(){
        getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }
    public void enteruser(String user){
        usernameinput.click();
        usernameinput.sendKeys(user);
    }
    public void enterpass(String password){
        passwordinput.click();
        passwordinput.sendKeys(password);
    }

    //tiempo para que la animacion del teclado salga de la pantalla
        public void clickprin(){
        principal.click();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void loginclick(){
        loginbutton.click();
    }
}