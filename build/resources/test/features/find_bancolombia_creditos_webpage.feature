#Author Yohel
  #language: en

  #historia de usuario
  Feature: Generar una simulacion de prestamo de libre inversion
    Como usuario necesito buscar el sistio web de bancolombia
    para generar una simulación de credito de libre inversion

  #hay escenarios multiples y singulares (se ejecuta solo un escenario)
  # se puede enviar diferentes filas de parametros para ejecutar la prueba
  #Scenario Outline: envia multiples combinaiciones de parametros

  Scenario: Buscar la pagina oficial de la udea en el motor de google
    Given que me encuentro en la pagina principal de google
    When escriba la palabra bancolombia creditos
    Then puedo ver el link de la pagina oficial de creditos de bancolombia


