@B29G23-164
Feature: Default

	Background:
		Given user is on the login page
		When user enters the user information
		Then user should be able to login and see "Dashboard" as a title
	
	@B29G23-161
	Scenario: User can change folder view order by Size
		When The user clicks on the "Files" tab in the navigation menu
		    Then The application displays folders sorted in the default view order
		    When The user clicks on the Size option from the sorting options
		    Then The application instantly rearranges the folder view by sorting folders by size
		    When The user clicks on the Size option from the sorting options second time
		    Then The application instantly rearranges the folder view by sorting folders by size in reverse order	

	
	@B29G23-162
	Scenario: User can change folder view order by Modified.
		When The user clicks on the "Files" tab in the navigation menu
		    Then The application displays folders sorted in the default view order
		    When The user clicks on the Modified option from the sorting options
		    Then The application instantly rearranges the folder view by sorting folders by date	

	
	@B29G23-160
	Scenario: User can change folder view order by Name
		When The user clicks on the "Files" tab in the navigation menu
		    Then The application displays folders sorted in the default view order
		    When The user clicks on the "Name" option from the sorting options
		    Then The application instantly rearranges the folder view by sorting folders in alphabetical order based on their names
		    When The user clicks on the "Name" option from the sorting options second time
		    Then The application instantly rearranges the folder view by sorting folders in alphabetical order based on their names in reverse order	

	
	@B29G23-163
	Scenario: User can select all the files at once and see the total values of all files in the first line when clicked on the “select all” checkbox at the left top corner of the list
		When The user clicks on the "Files" tab in the navigation menu
		    When the user clicks on the "Select All" checkbox located at the top left corner of the list
		
		    And the total value of all the files should be displayed on the first line