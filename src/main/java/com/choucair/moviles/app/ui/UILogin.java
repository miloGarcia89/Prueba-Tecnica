package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UILogin {
    public static final Target TXT_USUARIO = Target.the("Texto Usuario").located(MobileBy.AccessibilityId("test-Usuario"));
    public static final Target TXT_PASS = Target.the("Texto contraseña").located(MobileBy.xpath("(//android.widget.EditText)[2]"));
    public static final Target BTN_INGRESAR = Target.the("Boton login").located(MobileBy.AccessibilityId("test-LOGIN"));
}
