package com.nttdata.steps;

import com.nttdata.screens.CatalogScreen;
import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class SwaglabSteps {
    LoginScreen loginScreen;
    CatalogScreen catalogScreen;

    @Step("Click en user")
    public void clickuser(){
        loginScreen.timeoutclickuserinput();}
    @Step("Ingresa usuario {string} y contraseña {string}")
    public void searchByText(String user,String password){
        loginScreen.enteruser(user);
        loginScreen.enterpass(password);
        loginScreen.clickprin();
        loginScreen.loginclick();}
    @Step("Obtiene el texto PRODUCTS")
    public String getResultText(){
        return catalogScreen.gettitulo();}

    @Step("Validar que haya un elemento")
    public void validate(){
        catalogScreen.clickprimer();}
}
