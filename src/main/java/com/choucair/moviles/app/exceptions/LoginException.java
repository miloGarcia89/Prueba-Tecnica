package com.choucair.moviles.app.exceptions;

public class LoginException extends AssertionError{

    private static final String ERROR_CREDENCIALES = "Error al ingresar las credenciales de usuario";

    public static String ErrorCredenciales(){
        return ERROR_CREDENCIALES;
    }
}
