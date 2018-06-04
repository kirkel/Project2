Feature: Test all the links on the reports page 

	Background:
		Given a user opens a web browser to visit the Caliber website
		Then the user should see the home page
		And the user clicks on reports		
		And the user is on the reports page for the first time
		Then the user should see the reports page
		
	Scenario: test all downloads on the reports page 
		When a user selects a year from the reports page dropdown
		And the user selects a test bach from the assess batch dropdown
		Then the user should see the test batch on the page 
		And the user downloads all the data
		When the user selects a trainee from the test batch in the assess batch dropdown
		Then the user should see the test batch on the page 
		And the user downloads all the trainee data
