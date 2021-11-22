Feature: login
  yo como usuario
  quiero ingresar a la aplicacion
  para comprar productos

  Scenario Outline: login incorrecto
    Given estoy en la pagina
    When ingreso un usuario y una password
    |user|<user>|
    |user|<password>|
    Then debo ver un mensaje
    Examples:
      |user|password|
      #contraseña ivalidad para todos los suaurios
      |standard_user|wrongpassword|
      |locked_out_user|wrongpassword|
      |problem_user|wrongpassword|
      |userwrong|secret_sauce|
      |user|password|

