@wip
Feature: US-011 Activity Functionality
	User Story:
	As a user, I should be able to see listed items under the Activity module.

	Background:
		Given user is on the login page
		When user enters the user information
		Then user should be able to login and see "Dashboard" as a title

	#   
	@B29G23-139
	Scenario: User can see listed items under the Activity module
		Given the user is on the Activity module
		When the user views the listed items
		Then the user should be able to see all items	

	
	@B29G23-140
	Scenario: User can see all items listed in order from newest to oldest
		Given the user is on the Activity module
		When the user views the listed items
		Then the user should see the items ordered by newest to oldest	

	
	@B29G23-141
	Scenario: User sees "No more events to load" message at the end of "All Activities" tab
		Given the user is on the Activity module
		When the user scrolls to the end of the All Activities tab
		Then the user should see the message "No more events to load"