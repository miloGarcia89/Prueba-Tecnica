package com.choucair.moviles.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import java.util.logging.Logger;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;

public class AbreLaApp implements Task {

    public AbreLaApp(){}

    public static AbreLaApp carulla(){
        return Tasks.instrumented(AbreLaApp.class);
    }

    @Override
    @Step("App Carulla abierta")
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app Carulla");     // Paso en el que vamos
        actor.attemptsTo(TakeScreenshot.asEvidence());
    }
}