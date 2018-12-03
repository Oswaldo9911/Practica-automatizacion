#Author: your.email@your.domain.com

@LoginComputrabajo
Feature: Login to computrabajo.com
  As user, I want to login to elempleo.com with my credentials

  @SuccesfulLoginComputrabajo
  Scenario: Succesful Login
    Given I open Chrome
    And I go to Computrabajo 'https://www.computrabajo.com.co/'
    When I write my mail and pass
    | ingdavidayala1996@gmail.com  | dag1996 |
    Then I should be inside 'https://www.computrabajo.com.co/'
