#Author: ingdavidayala1996@gmail.com
@Register
Feature: Registering in computrabajo
  As a new user in computrabajo, I want to register to apply to the jobs

  @UnsuccesfulRegistry
  Scenario Outline: Unsuccesful registry
   Given that David goes to the web
    When he clicks the registry button
    And tries to register with his old information
      | Name   | Lastnames   | Email   | Password   | Desired Job   | Department   |
      | <Name> | <Lastnames> | <Email> | <Password> | <Desired Job> | <Department> |
    Then he should see the message "Obligatorio"

    Examples: 
      | Name  | Lastnames   | Email                      | Password   | Desired Job | Department |
      | David | Ayala Gomez |                            | olakase123 | Ingeniero   | Antioquia  |
      |       | Ayala Gomez | maracuta_david@hotmail.com | olakase123 | Ingeniero   | Antioquia  |
