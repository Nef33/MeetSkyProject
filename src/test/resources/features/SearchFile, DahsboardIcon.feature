@B29G23-167
Feature: Default

	
	@B29G23-165
	Scenario: User can search file typing its name through the magnifying glass icon inside any Module and see the details side page of the file when clicked on it.
		Feature: Search Functionalities
		
		
		  Scenario: Search File verification
		  Given user is on the login page
		  When user enters the user information
		  Then user should be able to login and see "Dashboard" as a title
		    And user click to contact page
		  When user type file  name  in glass icon
		    Then user should see file in side page	

	
	@B29G23-166
	Scenario: User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page.
		Feature: Dashboard Navigation
		
		  Scenario: Dashboard Navigate Back
		    Given user is on the login page
		    When user enters the user information
		    Then user should be able to login and see "Dashboard" as a title
		    And user is on the contact page
		    Then user should click to dashboard icon and back to home page