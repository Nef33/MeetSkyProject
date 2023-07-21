
Feature: Dashboard Navigation

  Scenario: Dashboard Navigate Back
    Given user is on the login page
    When user enters the user information
    Then user should be able to login and see "Dashboard" as a title
    And user is on the contact page
    Then user should click to dashboard icon and back to home page