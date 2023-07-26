Feature: Search Functionalities


  Scenario: Search File verification
    Given user is on the login page
    When user enters the user information
    Then user should be able to login and see "Dashboard" as a title
    And user click to contact page
    When user type file  name  in glass icon
    Then user should see file in side page