Feature: Test all links on the Assess Batch page

	Background:
		Given a user opens a web browser
		And navigates to the Caliber website
		Then the user should see the home page
		And clicks on the Assess Batch link
		Then the user should see the Assess Batch page
		
	Scenario:
		Then the user clicks on the Revature logo
		Then user returns back to the Assess Batch page
		Then the user clicks on the home button
		Then user returns back to the Assess Batch page
		Then the user clicks on assess batch
		Then the user clicks on reports
		Then user returns back to the Assess Batch page
		Then the user clicks on the phone number 
		Then the user clicks on the email 
		Then the user clicks on the Revature link and returns to the previous page
		