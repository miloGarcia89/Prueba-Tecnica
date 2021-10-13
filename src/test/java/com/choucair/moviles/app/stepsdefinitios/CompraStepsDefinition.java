package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.models.Usuario;
import com.choucair.moviles.app.questions.QuestionCompraExitosa;
import com.choucair.moviles.app.tasks.AbreLaApp;
import com.choucair.moviles.app.tasks.PrepararCompra;
import com.choucair.moviles.app.tasks.RealizarLogin;
import com.choucair.moviles.app.tasks.TerminaLaCompra;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraStepsDefinition {

    @Given("^que (.*) ingresa a la App SwagLabs para comprar un producto$")
    public void ingresarLoginSwagLabs(String actor) {theActorCalled(actor).wasAbleTo(AbreLaApp.swagLabs());}

    @When("^seleciona el articulo para continuar el proceso de compra$")
    public void ingresaCorreectamenteYCompraUnProducto(List<Usuario> usuario){
        theActorInTheSpotlight().attemptsTo(
                RealizarLogin.exitoso(usuario.get(0)),
                PrepararCompra.exitosamente(usuario.get(0)),
                TerminaLaCompra.exitosamente(usuario.get(0))
        );
    }

    @Then("^debe ver el (.*) en la pantalla al terminar el checkout: resumen$")
    public void validaMensaje(String mensaje){
        theActorInTheSpotlight().should(seeThat(QuestionCompraExitosa.mensajeExitoso(),equalTo(mensaje)));
    }
}