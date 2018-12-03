#Author: Grupo 2

Feature: Seleccion de Pelicula en Cinemark
  Como usuario quiero seleccionar una pelicula en Cinemark

  Scenario: Seleccion exitosa
    Given que puedo acceder a Cinemark
    When busco la pelicula <Una entrevista con Dios>
    And la selecciono
    Then entro al link de la pelicula