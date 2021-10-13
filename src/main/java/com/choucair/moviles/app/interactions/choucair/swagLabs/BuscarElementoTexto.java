package com.choucair.moviles.app.interactions.choucair.swagLabs;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static com.choucair.moviles.app.ui.UIElementoTexto.uiSelectorTexto;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BuscarElementoTexto implements Interaction {

    private String texto;

    public BuscarElementoTexto(String texto){this.texto = texto;}

    public static BuscarElementoTexto buscarTexto(String texto){
        return Tasks.instrumented(BuscarElementoTexto.class, texto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        getDriver().findElement(MobileBy.AndroidUIAutomator(
                 String.format(uiSelectorTexto(), texto)));
    }
}
