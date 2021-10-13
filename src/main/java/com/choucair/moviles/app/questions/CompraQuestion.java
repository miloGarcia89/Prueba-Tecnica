package com.choucair.moviles.app.questions;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.moviles.app.ui.UICompra.LBL_CONFIRMACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CompraQuestion implements Question<String> {

    public CompraQuestion(){}

    public static CompraQuestion obtenerTexto(){
        return new CompraQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_CONFIRMACION, isPresent()).forNoMoreThan(5).seconds(),
                TakeScreenshot.asEvidence());
        return Text.of(LBL_CONFIRMACION).viewedBy(actor).asString();
    }
}
