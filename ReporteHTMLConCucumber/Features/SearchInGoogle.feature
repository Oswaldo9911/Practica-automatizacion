#Author: ingdavidayala1996@hotmail.com

@tag
Feature: Search Suso in Google
  I want to search a word in Google

  @tag1
  Scenario: Succesful search
    Given I open the Browser
    When I go to Google
    And search the word
    Then I validate the result