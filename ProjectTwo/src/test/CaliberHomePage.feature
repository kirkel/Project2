Feature: Clicking on logo

	Background:
		Given a user opens a web browser
		And navigates to the Caliber website
		
	Scenario Outline:
		When a user clicks on the Revature logo
		Then the user should see the homepage