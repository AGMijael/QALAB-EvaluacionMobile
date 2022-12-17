package com.nttdata.screens;

import net.serenitybdd.core.pages.PageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CatalogScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement titulo;

    @AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]/android.view.ViewGroup/android.widget.ImageView")
    private WebElement primerElemento;
    public String gettitulo()
    {
        return titulo.getText();
    }

    //se usa un tiempo de espera para apreciar claramente que estamos en el catalogo y existe almenos un item haciendo click en él
    public void clickprimer()
    {
        primerElemento.click();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
