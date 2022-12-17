package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwaglabSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwaglabStepsDefs {
    @Steps
    SwaglabSteps swaglabSteps;
    @Given("que me enuentro en el login de Swaglab")
    public void que_me_enuentro_en_el_login_de_Swaglab() {
        swaglabSteps.clickuser();
    }

    @When("inicio sesión con usuario: {string} y contraseña: {string}")
    public void inicioSesiónConUsuarioYContraseña(String user, String password){
        swaglabSteps.searchByText(user,password);
    }

    //se captura el texto PRODUCTS validando que aparezca el titulo y por consiguiente estamos dentro del catalogo
    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text){
        Assert.assertEquals(swaglabSteps.getResultText(), text);
    }

    //se agrega un paso en gherkin y se valida que exista almenos un elemento haciendo click en la primera imagen de lo contrario no hay almenos un item
    @And("validar que haya un elemento")
    public void validarQueHayaUnElemento(){
        swaglabSteps.validate();
    }
}