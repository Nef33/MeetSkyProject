@wip
Feature:US-014 Check/Change Profile Settings Functionality
  User Story :
  As a user, I should be able to check or change profile info settings under the Profile module

  Background:
    Given user is on the login page
    When user enters the user information
    Then user should be able to login and see "Dashboard" as a title


  @B29G23-143
  Scenario: Full name and username should be the same
    When user on the Profile module
    And user navigate to the Profile module
    Then user Full name and username should be the same.


  @B29G23-144
  Scenario: User can enter a proper e-mail to Email input box
    When user on the Profile module
    When user enter a proper email "maksymvoloshyn5@gmail.com" in the Email input box
    And user click on the add button
    Then my email address should be updated


  @B29G23-145
  Scenario: User can change Language
    When user on the Profile module
    Then user select a different language from the Language dropdown and language preference should be updated

  @B29G23-150
  Scenario: User can see all titles in Personal Info
    When user on the Profile module
    And user navigate to the Profile module
    And User should see all titles inside Personal Info:





