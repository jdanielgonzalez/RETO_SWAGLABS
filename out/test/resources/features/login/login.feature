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
      |user                   |password     |
      |standard_user          |wrongpassword|
      |locked_out_user        |secret_sauce |
      |problem_user           |wrongpassword|
      |performance_glitch_user|wrongpassword|
      |empty                  |secret_sauce |
      |standard_user          |empty        |

