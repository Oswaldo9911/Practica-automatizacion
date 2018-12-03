#Author: ingdavidayala1996@gmail.com
@Login
Feature: Login in computrabajo
  As a registered user, I want to log in to computrabajo

  @Succesful
  Scenario Outline: Succesful Login
    Given that David wants to log in to computrabajo
    When he sends his <email> and <password>
    Then he should see his <name> in the navegation bar

    Examples: 
      | email                       | password | name              |
      | ingdavidayala1996@gmail.com | dag1996  | David Ayala Gómez |
