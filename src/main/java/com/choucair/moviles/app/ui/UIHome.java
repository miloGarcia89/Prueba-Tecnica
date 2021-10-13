package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIHome {
    public static final Target LBL_MENSAJE = Target.the("Mensaje de confirmacion").located(MobileBy.xpath("(//android.widget.TextView)[1]"));
    public static final Target BTN_ALTERNAR = Target.the("Boton lista productos").located(MobileBy.AccessibilityId("test-Alternar"));
    public static final String LOCALIZADOR_PRODUCTO = "//android.widget.TextView[@text='%s']";
}
