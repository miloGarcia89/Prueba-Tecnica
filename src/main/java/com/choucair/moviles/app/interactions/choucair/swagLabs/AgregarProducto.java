package com.choucair.moviles.app.interactions.choucair.swagLabs;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.models.Compra;
import com.choucair.moviles.app.ui.UIHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProducto implements Task {

    Compra compra;

    public AgregarProducto(Compra compra){
        this.compra = compra;
    }

    public static AgregarProducto alCarrito(Compra articulo) {
        return Tasks.instrumented(AgregarProducto.class,articulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(String.format(UIHome.LOCALIZADOR_PRODUCTO,compra.getProducto())),
               TakeScreenshot.asEvidence()
       );
    }
}
