@wip
Feature: Folder View Functionality (Automation - )
  User story: As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  Scenario: User can change folder view order by Name
    When user enters the user information
    Then user should be able to login and see "Dashboard" as a title
    When The user clicks on the "Files" tab in the navigation menu
    Then The application displays folders sorted in the default view order
    When The user clicks on the "Name" option from the sorting options
    Then The application instantly rearranges the folder view by sorting folders in alphabetical order based on their names
    When The user clicks on the "Name" option from the sorting options second time
    Then The application instantly rearranges the folder view by sorting folders in alphabetical order based on their names in reverse order
