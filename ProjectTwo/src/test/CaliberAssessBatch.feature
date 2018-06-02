Feature: Test all links on the Assess Batch page

	Background:
		Given a user opens a web browser to visit the Caliber website
		Then the user should see the home page
		When the user clicks on assess batch
		And the user is on the assess batch page for the first time
		Then the user should see the assess batch page
				
#	Scenario:
#		# ----------- Header link checks -----------
#		And the user clicks on the Revature logo
#		Then the user should see the home page
#		And the user returns back to the previous page 
#		Then the user should see the assess batch page
#			
#		And the user clicks on the home button
#		Then the user should see the home page
#		And the user returns back to the previous page 
#		Then the user should see the assess batch page
#		
#		And the user clicks on manage batch
#		Then the user should see the manage batch page
#		And the user returns back to the previous page 
#		Then the user should see the assess batch page
#		
#		And the user clicks on assess batch
#		Then the user should see the assess batch page
#		
#		And the user clicks on reports
#		Then the user should see the reports page
#		And the user returns back to the previous page 
#		Then the user should see the assess batch page
#		
#		
#		# ----------- Footer link checks -----------
#		And the user clicks on the phone number 		
#		And the user clicks on the email 
#		And the user clicks on the Revature link and returns to the previous page
		
		
	Scenario: test the assessment scores 
		When the user selects a year from the assess batch dropdown 
		And the user selects a test batch from the assess batch dropdown 
		Then the user should see the test batch on the assess batch page 
		When the user creates an assessment and enters all the input 
		Then the user should see the assessment in the table 
		When the user enters in the assessment scores and flags the appropiate users 
		Then the user should see the asessments with data in the table 
		
		
		
		
		
		