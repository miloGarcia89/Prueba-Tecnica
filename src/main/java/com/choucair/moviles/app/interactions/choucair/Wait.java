package com.choucair.moviles.app.interactions.choucair;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {

    private int time;

    public Wait(int time) {
        this.time = time;
    }

    public static Wait explicit(int time) {
        return Tasks.instrumented(Wait.class, time);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
