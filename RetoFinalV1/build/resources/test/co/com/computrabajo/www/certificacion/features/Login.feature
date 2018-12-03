#Author: ingdavidayala1996@gmail.com
@LogIn
Feature: Log in to computrabajo
  As a registered user, I want to log in to computrabajo

  @SuccesfulLogin
  Scenario: Logs in computrabajo
    Given that David goes to the web
    When he clicks the Login button
    And logs in with his email and password
      | email                       | password |
      | ingdavidayala1996@gmail.com | dag1996  |
    Then he should see his name
      | David Ayala Gomez |
