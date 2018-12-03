#Author: your.email@your.domain.com

@Login
Feature: Login to elempleo.com
  As user, I want to login to elempleo.com with my credentials

  @SuccesfulLogin
  Scenario: Succesful Login
    Given I open the browser
    And I go to the URL 'https://www.trabajando.com.co/ingresocandidatos/8'
    When I write my credentials
    | maracuta_david@hotmail.com  | Dagan001 |
    Then I should be in the URL 'http://www.elempleo.com/co/homeusuario'
    
