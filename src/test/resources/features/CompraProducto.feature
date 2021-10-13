@author Camilo Garcia

@CompraProducto
Feature: Como cliente de SwagLabs deseo ingresar al APP para
  realizar la compra de un producto de la tienda

  Background: Intento de inicio de sesion en la App de SwagLabs
    Given que Camilo quiere validar sus credenciales
    And ingresar sus datos correctamente
      |user|pass|
      |standard_user|secret_sauce|

  @CompraProductoExitoso
  Scenario Outline: Intento de realizar una compra de producto exitosa
    When realiza la compra de un producto
      |producto|nombre|apellido|codigoPostal|
      |<producto>|<nombre>|<apellido>|<codigoPostal>|
    Then podra ver el mensaje <confirmacion>

    Examples:
      |producto|nombre|apellido|codigoPostal|confirmacion|
      |Mochila Sauce Labs|Camilo|Garcia|0057|GRACIAS POR SU ORDEN|


    @CompraProductoPreciosBajosExitoso
    Scenario Outline: Intento de realizar una compra de producto por precios bajos exitosa
      When realiza la compra de un producto
        |producto|nombre|apellido|codigoPostal|
        |<producto>|<nombre>|<apellido>|<codigoPostal>|
      Then podra ver el mensaje <confirmacion>

      Examples:
        |producto|nombre|apellido|codigoPostal|confirmacion|
        |Mameluco Sauce Labs|Andres|Perez|1265|GRACIAS POR SU ORDEN|

  @CompraVariosProductoExitoso
  Scenario Outline: Intento de realizar una compra de varios productos exitosa
    When Seleccionar varios productos y realiza la compra
      |producto|nombre|apellido|codigoPostal|
      |<producto>|<nombre>|<apellido>|<codigoPostal>|
    Then podra ver el mensaje <confirmacion>

    Examples:
      |producto|producto|nombre|apellido|codigoPostal|confirmacion|
      |Mameluco Sauce Labs|Chamarra Sauce Labs|Andres|Perez|1265|GRACIAS POR SU ORDEN|