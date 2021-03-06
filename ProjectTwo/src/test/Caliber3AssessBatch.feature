Feature: Test all links on the Assess Batch page

	Background:
		Given a user opens a web browser to visit the Caliber website
		Then the user should see the home page
		When the user clicks on assess batch
		And the user is on the assess batch page for the first time
		Then the user should see the assess batch page		
		
	Scenario: test the assessment scores 
		When the user selects a year from the assess batch dropdown 
		And the user selects a test batch from the assess batch dropdown 
		Then the user should see the test batch on the assess batch page 
		When the user creates an assessment and enters all the input 
		Then the user should see the assessment in the table 
		When the user enters in the assessment scores and flags the appropiate users 
		Then the user should see the asessments with data in the table 
		When the user deletes an assessment 
		Then the user should see the asessments with data in the table 
		When the user adds the scores to an assessment 
		Then the user should see the asessments with data in the table  
		When the user adds a new week
		Then the user should see the asessments with data in the table 
		
		
		