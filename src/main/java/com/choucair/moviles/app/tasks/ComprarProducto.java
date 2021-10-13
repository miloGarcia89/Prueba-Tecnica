package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.choucair.SwipeByCoordinates;
import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.Wait;
import com.choucair.moviles.app.interactions.choucair.swagLabs.AgregarProducto;
import com.choucair.moviles.app.interactions.choucair.swagLabs.BuscarElementoTexto;
import com.choucair.moviles.app.interactions.choucair.swagLabs.FinalizarCompra;
import com.choucair.moviles.app.models.Compra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.moviles.app.ui.UIHome.BTN_ALTERNAR;
import static com.choucair.moviles.app.ui.UIProducto.BTN_AGREGAR;

public class ComprarProducto implements Task {

    Compra compra;

    public ComprarProducto(Compra compra){
        this.compra = compra;
    }

    public static ComprarProducto alCarrito(Compra articulo) {
        return Tasks.instrumented(ComprarProducto.class,articulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ALTERNAR),
                BuscarElementoTexto.buscarTexto(compra.getProducto()),
                AgregarProducto.alCarrito(compra),
                Wait.explicit(3000),
                SwipeByCoordinates.desplazar(504,2083,532,1414),
                Click.on(BTN_AGREGAR),
                FinalizarCompra.exitosa(compra),
                TakeScreenshot.asEvidence()
        );
    }
}