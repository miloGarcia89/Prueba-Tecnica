package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UICompra {

    public static final Target BTN_CARRITO_COMPRAS = Target.the("Textfeld Usuario").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Carrito\"]/android.view.ViewGroup"));
    public static final Target BTN_CHECKOUT = Target.the("Textfeld Usuario").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView"));
    public static final Target TXT_NOMBRE = Target.the("Textfeld Usuario").located(MobileBy.AccessibilityId("test-Nombre"));
    public static final Target TXT_APELLIDO = Target.the("Textfeld Usuario").located(MobileBy.AccessibilityId("test-Apellido"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("Textfeld Usuario").located(MobileBy.AccessibilityId("test-Código postal"));
    public static final Target BTN_CONTINUAR = Target.the("Textfeld Usuario").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUAR\"]"));
    public static final Target BTN_TERMINAR = Target.the("Textfeld Usuario").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-TERMINAR\"]"));
    public static final Target LBL_CONFIRMACION = Target.the("Textfeld Usuario").located(MobileBy.xpath("(//android.widget.TextView)[2]"));
}
