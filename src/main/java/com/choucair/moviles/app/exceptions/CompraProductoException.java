package com.choucair.moviles.app.exceptions;

public class CompraProductoException extends AssertionError{

    private static final String ERROR_COMPRA = "Error al comprar un producto de la tienda";

    public static String ErrorCompra(){
        return ERROR_COMPRA;
    }
}
