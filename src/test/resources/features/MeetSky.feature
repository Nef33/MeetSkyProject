@B29G23-159
Feature: Add to Favorites/Rename/Comment on File Functionality
	User Story :
	As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.

	Background:
		Given user is on the login page
		When user enters the user information
		Then user should be able to login and see "Dashboard" as a title

	@B29G23-155
	Scenario: add any file to favorites from its own three dots menu.
		When user clicks on "file" module
		    And user clicks three dots menu
		    And user add a file to favorites
		    Then user sees file under favorites tab	

	
	@B29G23-156
	Scenario: rename any file from its own three dots menu.
		When user clicks on "file" module
		    And user clicks three dots menu
		    Then user clicks rename button	

	
	@B29G23-157
	Scenario:  Put some comments on any file from the file details menu opened right side.
		When user clicks on "file" module
		    And user clicks three dots menu
		    And user clicks Details button
		    When user clicks on Comments Option
		    Then user enters comment and clicks