package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.exceptions.CompraProductoException;
import com.choucair.moviles.app.models.Compra;
import com.choucair.moviles.app.questions.CompraQuestion;
import com.choucair.moviles.app.tasks.ComprarProducto;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraProductoStepDefinition {

    @When("^realiza la compra de un producto$")
    public void realizaLaCompraDeUnProducto(List<Compra> compra) {
        theActorInTheSpotlight().attemptsTo(ComprarProducto.alCarrito(compra.get(0)));
    }

    @Then("^podra ver el mensaje (.*)$")
    public void podraVerElMensaje(String confirmacion) {
        theActorInTheSpotlight().should(seeThat(CompraQuestion.obtenerTexto(), equalTo(confirmacion))
                                .orComplainWith(CompraProductoException.class,CompraProductoException.ErrorCompra()));
    }

}
