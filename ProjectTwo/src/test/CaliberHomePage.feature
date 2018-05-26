Feature: Test all links on the home page 

	Background:
		Given a user opens a web browser
		And navigates to the Caliber website
		Then the user should see the home page

	Scenario:
		Then the user clicks on the Revature logo
		Then the user clicks on the home button
		Then the user clicks on manage batch and back home
		Then the user clicks on assess batch and back home
		Then the user clicks on reports and back home
		Then the user clicks on user guide and back home
		
		
		