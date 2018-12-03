#Author: your.email@your.domain.com
@ChooseAJob
Feature: Choose a Job
  As a non-registered user, I want to search a Job

  @ChooseANiceJob
  Scenario: Choosing a Java Job
    Given that David goes to the web
    When David searches a Job
      | Java |
    Then he chooses the option number he wants
      | 2 |
