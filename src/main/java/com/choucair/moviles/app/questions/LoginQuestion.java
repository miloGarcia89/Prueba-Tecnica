package com.choucair.moviles.app.questions;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.moviles.app.ui.UIHome.LBL_MENSAJE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class LoginQuestion implements Question<Boolean> {

    private String mensaje;

    public LoginQuestion(String mensaje) {
        this.mensaje=mensaje;
    }

    public static LoginQuestion obtenerTexto(String mensaje){
        return new LoginQuestion(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_MENSAJE, isPresent()).forNoMoreThan(5).seconds(),
                TakeScreenshot.asEvidence());
        return Text.of(LBL_MENSAJE).viewedBy(actor).asString().equals(this.mensaje);
    }
}