package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.moviles.app.ui.UILogin.*;

public class RealizarLogin implements Task {

    Usuario usuario;

    public RealizarLogin(Usuario usuario){
        this.usuario = usuario;
    }

    public static RealizarLogin Correcto(Usuario datos){
        return Tasks.instrumented(RealizarLogin.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getUser()).into(TXT_USUARIO),
                Enter.theValue(usuario.getPass()).into(TXT_PASS),
                Click.on(BTN_INGRESAR),
                TakeScreenshot.asEvidence()
        );
    }
}
