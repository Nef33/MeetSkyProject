@B29G23-180
Feature: Default

	
	@B29G23-168
	Scenario: User can create a new contact
		Given user is on the login page
		     When user enters the user information
		     Then user should be able to login and see "Dashboard" as a title
		     When user is click the contacts module
		     And user is click the new contact button
		     Then user creates newName	

	
	@B29G23-177
	Scenario: User can see all contact and total number
		Given user is on the login page
		      When user enters the user information
		      Then user should be able to login and see "Dashboard" as a title
		      When user is click the contacts module
		      And user clicks the all contacts button
		      Then user should see all total contact number	

	
	@B29G23-178
	Scenario: User can change profile picture
		Given user is on the login page
		     When user enters the user information
		     Then user should be able to login and see "Dashboard" as a title
		     When user is click the contacts module
		     And user clicks img icon
		     And users clicks choose from files
		     And users picks some img
		     Then user clicks choose button	

	
	@B29G23-179
	Scenario:  User can delete any selected contact
		Given user is on the login page
		    When user enters the user information
		    Then user should be able to login and see "Dashboard" as a title
		    When user is click the contacts module
		    And  user clicks three dot button
		    Then user clicks delete button