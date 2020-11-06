Feature: Inicio de Sesion Exitoso
  Como usuario quiero iniciar sesion en la página de usuarios

  @scenario1
  Scenario:Iniciar sesion correctamente en la Página Orange HRM

    Given El usuario se encuentra en la pagina de inicio de sesion de Orange HRM
    When El usuario ingresa sus datos de username y password y da click al boton login
    Then Se debe redirigir a la página home del usuario

  @scenario2
  Scenario:Iniciar sesion incorrectamente en la Página Orange HRM

    Given El usuario ingresa en la pagina de inicio de sesion de Orange HRM
    When El usuario ingresa sus datos de username incorrectos y password y da click al boton login
    Then Se debe mostrar mensaje de error de intento inválido


  @scenario3
  Scenario:Ingresar en la opcion Admin-ProjectInfo-Customers

    Given El usuario ingresa en la pagina customers
    When El usuario ingresa los datos de name y desc da click al boton save
    Then Se debe mostrar mensaje registro exitoso