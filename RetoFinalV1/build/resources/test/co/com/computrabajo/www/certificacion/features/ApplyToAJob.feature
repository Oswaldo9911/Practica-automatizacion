#Author: ingdavidayala1996@gmail.com
@ApplyingToAJob
Feature: Applying to a Job in Computrabajo
  As a registered user, I want to login, search and apply to a job

	Background: David logs in computrabajo and searches a job
    Given that David goes to the web
    When he clicks the Login button
    And logs in with his email and password
      | email                       | password |
      | ingdavidayala1996@gmail.com | dag1996  |
    Then he should see his name
      | David Ayala Gomez |
    When David searches a Job
      | Java |
    Then he chooses the option number he wants
      | 4 |
    
    
  @SuccesfulApplicationToAJob
  Scenario: Succesful Application
    When he applies to the offer
    Then he should see a confirmation message
    
