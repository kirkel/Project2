Feature: Test all links on the Assess Batch page

	Background:
		Given a user opens a web browser to visit the Caliber website
		Then the user should see the home page
		And the user clicks on assess batch
		And the user is on the assess batch page for the first time
		Then the user should see the assess batch page
				
	Scenario:
		# ----------- Header link checks -----------
		And the user clicks on the Revature logo
		Then the user should see the home page
		And the user returns back to the previous page 
		Then the user should see the assess batch page
			
		And the user clicks on the home button
		Then the user should see the home page
		And the user returns back to the previous page 
		Then the user should see the assess batch page
		
		And the user clicks on manage batch
		Then the user should see the manage batch page
		And the user returns back to the previous page 
		Then the user should see the assess batch page
		
		And the user clicks on assess batch
		Then the user should see the assess batch page
		
		And the user clicks on reports
		Then the user should see the reports page
		And the user returns back to the previous page 
		Then the user should see the assess batch page
		
		
		# ----------- Footer link checks -----------
		And the user clicks on the phone number 		
		And the user clicks on the email 
		And the user clicks on the Revature link and returns to the previous page
		
		
		# ----------- Unique links and buttons checks -----------
#		# secondary header button check
#		And the user picks an assessment manager "<assessment_manager>"
#		Given the assessment manager "<assessment_manager>" is a valid selection
#		Then the user should see data
#		
#		And the user picks a year <assessment_year_dropdown> from the dropdown 
#		Given the year <assessment_year_dropdown> is 2018
#		Then the user should see data
#		
#		Given the week <assessment_week_pick> is a valid selection
#		And the user picks a week <assessment_week_pick>
#		Then the user should see data
#		
#		
#		
#		# adding new data into the table 
#		
#		# add new week
#		And the user adds a new week
#		Then the user should see the new week selection on the table
#		Given the trainees "<trainees>" are valid input
#		And the user adds data for notes "<assessment_notes>" for all trainees "<trainees>" and overall feedback "<assessment_feedback>"
#		Then the user saves the table
#		Then the user should see data
#		Then the user should see the new notes "<assessment_notes>" for all trainees "<trainees>" and overall feedback "<assessment_feedback>"
#		
#		Given the week <assessment_week_newassessment> is a valid selection
#		And the user creates an assessment for a week <assessment_week_newassessment>
#		Given the assessment "<assessments>" with category "<assessment_category>" and max points <max_points> and assessment type "<assessment_type>" are valid input 
#		And the user chooses an assessment category "<assessment_category>" and max points <max_points> and an assessment type "<assessment_type>"
#		Then the user should see data
#		Then the user should see the correctly calculated percentage header for all "<assessments>" 
#		
#		Then the user adds in scores for assessments "<assessments>"
		
		
		
		
		
		