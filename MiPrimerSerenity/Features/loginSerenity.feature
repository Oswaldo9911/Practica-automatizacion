#Author: ingdavidayala1996@gmail.com

@LoginFeature
Feature: Login in new tours page
	As registered user
  I want to go the home page of Computrabajo
  and log in with my email and password

  @GoodLogin
  Scenario: Succesful login
    Given that I go to Computrabajo home page
    When I fill the email and password fields
    And Click the submit button
    Then I access