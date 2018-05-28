Feature: Test all the links on the manage batch page 

	Background:
		Given a user opens a web browser to visit the Caliber website
		Then the user should see the home page
		And the user clicks on manage batch		
		And the user is on the manage batch page for the first time
		Then the user should see the manage batch page
		
	Scenario:
		# ----------- Header link checks -----------
		And the user clicks on the Revature logo
		Then the user should see the home page
		And the user returns back to the previous page 
		Then the user should see the manage batch page
		
		And the user clicks on the home button
		Then the user should see the home page
		And the user returns back to the previous page 
		Then the user should see the manage batch page
		
		And the user clicks on manage batch
		Then the user should see the manage batch page
		
		And the user clicks on assess batch
		Then the user should see the assess batch page
		And the user returns back to the previous page 
		Then the user should see the manage batch page
		
		And the user clicks on reports
		Then the user should see the reports page
		And the user returns back to the previous page 
		Then the user should see the manage batch page
		
		# ----------- Footer link checks -----------
		And the user clicks on the phone number 		
		And the user clicks on the email 
		And the user clicks on the Revature link and returns to the previous page
		
		
		# ----------- Unique links and buttons checks -----------
		#testing create a batch for a given year
#		Given the year <start_year> is between 2016 and 2019
#		And the user selects a year <start_year> for the batch
		
		
		
		# ----------- Canvas Elements Checks -----------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		