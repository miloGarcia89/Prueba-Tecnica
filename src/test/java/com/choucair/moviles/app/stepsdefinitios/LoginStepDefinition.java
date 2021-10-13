package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.exceptions.LoginException;
import com.choucair.moviles.app.models.Usuario;
import com.choucair.moviles.app.questions.LoginQuestion;
import com.choucair.moviles.app.tasks.AbreLaApp;
import com.choucair.moviles.app.tasks.RealizarLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Given("^que (.*) quiere validar sus credenciales$")
    public void queQuiereValidarSusCredenciales(String actor) {
        theActorCalled(actor).wasAbleTo(AbreLaApp.swagLabs());
    }

    @When("^ingresar sus datos correctamente$")
    public void ingresarSusDatosCorrectamente(List<Usuario> cliente) {
        theActorInTheSpotlight().attemptsTo(RealizarLogin.Correcto(cliente.get(0)));
    }

    @Then("^debe ver la opcion (.*) en home del app$")
    public void debeVerLaOpcionEnHomeDelApp(String mensaje) {
        theActorInTheSpotlight().should(seeThat(LoginQuestion.obtenerTexto(mensaje))
                                .orComplainWith(LoginException.class, LoginException.ErrorCredenciales()));
    }
}
