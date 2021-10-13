@autor Juan Roa

Feature: Como usuario quiero ingresar a la App SwagLabs para comprar un producto
  @RutaCompra
  Scenario Outline: Intento Compra Exitosa
    Given que Juan ingresa a la App SwagLabs para comprar un producto
    When  seleciona el articulo para continuar el proceso de compra
      |usuario|contrasena|producto|nombre|apellido|codpostal|
      |<usuario>|<contrasena>|<producto>|<nombre>|<apellido>|<codpostal>|
    Then debe ver el <mensaje> en la pantalla al terminar el checkout: resumen

    Examples:
      |usuario|contrasena|producto|nombre|apellido|codpostal|mensaje|
      |standard_user|secret_sauce|Chamarra Sauce Labs|Juan|Roa|111156|GRACIAS POR SU ORDEN|