
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


    Scenario:User can select any of the widgets
      When user clicks on Customize Button
      Then user should be able to select on each widget



      Scenario:User can select status button

        When user clicks on Status button
        Then user is able to select any status option
        Then user is able to see the selected status on dashboard
