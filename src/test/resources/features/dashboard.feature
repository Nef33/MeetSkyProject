@db
Feature: Dashboard page modules
Background:
  Given user already logged in

  Scenario: After Login user can see all modules and Username.


    When each module displays on the dashboard page
    Then user see module name of the modules
      | dashboard |
      | files     |
      | photos    |
      | activity  |
      | spreed    |
      | mail      |
      | contacts  |
      | calendar  |
      | notes     |
      | deck      |
      | tasks     |

    Then user see the username on the dashboard


    Scenario:
      When user clicks on Customize Button
      Then

