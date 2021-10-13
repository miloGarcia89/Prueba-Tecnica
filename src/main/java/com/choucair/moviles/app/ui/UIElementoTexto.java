package com.choucair.moviles.app.ui;

public class UIElementoTexto {
    private static final String UI_SELECTOR_TEXTO = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"%s\").instance(0))";
    public static String uiSelectorTexto() {
        return UI_SELECTOR_TEXTO;
    }
}
