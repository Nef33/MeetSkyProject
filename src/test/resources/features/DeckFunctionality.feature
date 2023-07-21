@B29G23-154
Feature: Deck Module Functionality

	User Story :
	As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.

	@B29G23-149
	Scenario: User can create a new board
		Given user is on the login page
		    When user enters the user information
		    Then user should be able to login and see "Dashboard" as a title
		    Given user is on the Deck Module
			And user clicks on three line navigation bar
		    When user clicks on Add boards
		    Then user types a new board name "Project B"
		    Then user click on arrow or hit the Enter key on keyboard
		    And new board should be displayed under All boards	

	
	@B29G23-151
	Scenario: User can create a new list of card/task under any board
		Given user is on the login page
		    When user enters the user information
		    Then user should be able to login and see "Dashboard" as a title
		    Given user is on the Deck Module
		    And user clicks on three line navigation bar
		    When User choose a board name "Project B"
		    Then user clicks s on Add list button
		    And types a new list name "list"
		    Then user clicks on arrow or hit the Enter key on keyboard
		    And new list should be displayed	

	
	@B29G23-152
	Scenario: User can add a new card/task on any list on the current board
		Given user is on the login page
		    When user enters the user information
		    Then user should be able to login and see "Dashboard" as a title
		    Given user is on the Deck Module
		    And user clicks on three line navigation bar
		    When user clicks on Add card button
		    And types a new card name "New Card"
		    Then user clicks on arrow
		    Then new card is displayed	

	
	@B29G23-153
	Scenario: User can assign any card/task to himself/herself by using the three dots on the related card
		Given user is on the login page
		    When user enters the user information
		    Then user should be able to login and see "Dashboard" as a title
		    Given user is on the Deck Module
		    And user clicks on three line navigation bar
		    When user clicks on three dots on the related card "New Card"
		    And selects Assign to me
		    Then user profile icon should be displayed near the three dots icon