Feature: Test all links on the home page 

	Background:
		Given a user opens a web browser to visit the Caliber website
		And the user is on the home page for the first time
		Then the user should see the home page

	Scenario:
		And the user clicks on the Revature logo
		Then the user should see the home page
		
		And the user clicks on the home button
		Then the user should see the home page
		
		And the user clicks on manage batch
		Then the user should see the manage batch page
		And the user returns back to the previous page 
		Then the user should see the home page
		
		And the user clicks on assess batch
		Then the user should see the assess batch page
		And the user returns back to the previous page 
		Then the user should see the home page
		
		And the user clicks on reports
		Then the user should see the reports page
		And the user returns back to the previous page 
		Then the user should see the home page
		 
		And the user clicks on user guide
		Then the user should see the github page for Caliber
		And the user returns back to the previous page 
		Then the user should see the home page
		
		And the user clicks on the phone number 		
		And the user clicks on the email 
		
		And the user clicks on the Revature link and returns to the previous page
		
		And the user clicks on the HTML5 Canvas element Cumulative Scores
		And the user clicks on the HTML5 Canvas element Technical Skills
		
		