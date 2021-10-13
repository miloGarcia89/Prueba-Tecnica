package com.choucair.moviles.app.interactions.choucair.swagLabs;

import com.choucair.moviles.app.interactions.choucair.SwipeByCoordinates;
import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.Wait;
import com.choucair.moviles.app.models.Compra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.moviles.app.ui.UICompra.*;

public class FinalizarCompra implements Interaction {

    Compra compra;
    public  FinalizarCompra(Compra compra){
        this.compra = compra;
    }

    public static FinalizarCompra exitosa(Compra datos){
        return Tasks.instrumented(FinalizarCompra.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CARRITO_COMPRAS),
                Click.on(BTN_CHECKOUT),
                Enter.theValue(compra.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(compra.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(compra.getCodigoPostal()).into(TXT_CODIGO_POSTAL),
                Click.on(BTN_CONTINUAR),
                Wait.explicit(3000),
                SwipeByCoordinates.desplazar(504,2083,532,1414),
                Click.on(BTN_TERMINAR),
                TakeScreenshot.asEvidence()
        );
    }
}
