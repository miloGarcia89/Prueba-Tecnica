@author Camilo Garcia

@Login
Feature: Como Usuario de SwagLabs deseo
        ingresar al App para comprar un producto

  @LoginExitoso
  Scenario Outline: intento de autenticacion exitoso
    Given que Camilo quiere validar sus credenciales
    When ingresar sus datos correctamente
      |user|pass|
      |<user>|<pass>|
    Then debe ver la opcion <mensaje> en home del app

    Examples:
      |user|pass|mensaje|
      |standard_user|secret_sauce|PRODUCTOS|