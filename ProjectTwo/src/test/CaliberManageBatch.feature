Feature: Test all the links on the manage batch page

  Background: 
    Given a user opens a web browser to visit the Caliber website
    Then the user should see the home page
    When the user clicks on manage batch
    And the user is on the manage batch page for the first time
    Then the user should see the manage batch page

  #Scenario: test the headers and footers
#		# ----------- Header link checks -----------
#		And the user clicks on the Revature logo
#		Then the user should see the home page
#		And the user returns back to the previous page
#		Then the user should see the manage batch page
#	
#		And the user clicks on the home button
#		Then the user should see the home page
#		And the user returns back to the previous page
#		Then the user should see the manage batch page
#	
#		And the user clicks on manage batch
#		Then the user should see the manage batch page
#	
#		And the user clicks on assess batch
#		Then the user should see the assess batch page
#		And the user returns back to the previous page
#		Then the user should see the manage batch page
#	
#		And the user clicks on reports
#		Then the user should see the reports page
#		And the user returns back to the previous page
#		Then the user should see the manage batch page
#	
#		# ----------- Footer link checks -----------
#		And the user clicks on the phone number
#		And the user clicks on the email
#		And the user clicks on the Revature link and returns to the previous page
	
	
#	Scenario: test the import batch button
#		And the user clicks on the import batch button
#		Then the user should see the import batch screen
#		And the user clicks on the X button on the import batch screen
#		Then the user should see the manage batch page
#	
#		And the user clicks on the import batch button
#		And the user imports a batch
#		Then the user should see the import batch screen
#		And the user clicks on the close import batch
#		Then the user should see the manage batch page
#
	Scenario: test the functions of the add trainee screen
		Given the user has selected a year with a batch
    When the user clicks on add a trainee to the batch 
    Then the user should see the add a trainee screen
    When the user clicks on the exit from the trainee screen
    Then the user should see the manage batch page
    
    When the user clicks on add a trainee to the batch 
    And the user clicks on close from the add a trainee screen
    Then the user should see the manage batch page

  Scenario: test the create a batch
    When the user clicks on create batch
    Then the user should see the create batch screen
    When the user clicks on the X button on the create batch screen
    Then the user should see the manage batch page
    When the user clicks on create batch
    And the user hovers over the info for good and passing grades
    And the user clicks on the close create batch
    Then the user should see the manage batch page
   
   Scenario: The user adds a new batch with a trainee given input from the hibernate database 
    Given the user clicks on create batch
    When the user inputs all of the batch information 
    And the user clicks on save in create batch
    Then the user should see the correct data on the batch table 
		When the user inputs all of the trainee information 
		

	Scenario Outline: test the required nature of each field
    And the user clicks on create batch
    Then the user should see the create batch screen
    And the user clicks on save in create batch
    Then the user should see the create batch screen
    
    And the user adds a training name "<batch_trainingName>"
    And the user clicks on save in create batch
    And the user clicks on the close create batch
    
    And the user clicks on create batch
    And the user adds a training name "<batch_trainingName>"
    And the user adds a training type "<batch_trainingType>"
    And the user clicks on save in create batch
    Then the user should see the create batch screen
    And the user clicks on the close create batch
    
    And the user clicks on create batch
    And the user adds a training name "<batch_trainingName>"
    And the user adds a training type "<batch_trainingType>"
    And the user adds a skill type "<batch_skillType>"
    And the user clicks on save in create batch
    Then the user should see the create batch screen
    And the user clicks on the close create batch
    
    And the user clicks on create batch
    And the user adds a training name "<batch_trainingName>"
    And the user adds a training type "<batch_trainingType>"
    And the user adds a skill type "<batch_skillType>"
    And the user adds a location "<batch_location>"
    And the user clicks on save in create batch
    Then the user should see the create batch screen
    And the user clicks on the close create batch
    
    And the user clicks on create batch
    And the user adds a training name "<batch_trainingName>"
    And the user adds a training type "<batch_trainingType>"
    And the user adds a skill type "<batch_skillType>"
    And the user adds a location "<batch_location>"
    And the user adds a trainer "<batch_trainer>"
    And the user clicks on save in create batch
    Then the user should see the create batch screen
    And the user clicks on the close create batch
    
    And the user clicks on create batch
    And the user adds a training name "<batch_trainingName>"
    And the user adds a training type "<batch_trainingType>"
    And the user adds a skill type "<batch_skillType>"
    And the user adds a location "<batch_location>"
    And the user adds a trainer "<batch_trainer>"
    And the user adds a cotrainer "<batch_cotrainer>"
    And the user clicks on save in create batch
    Then the user should see the create batch screen
    And the user clicks on the close create batch
    
    And the user clicks on create batch
    And the user adds a training name "<batch_trainingName>"
    And the user adds a training type "<batch_trainingType>"
    And the user adds a skill type "<batch_skillType>"
    And the user adds a location "<batch_location>"
    And the user adds a trainer "<batch_trainer>"
    And the user adds a cotrainer "<batch_cotrainer>"
    And the user adds a start date "<batch_startMonth>" "<batch_startDay>" "<batch_startYear>"
    And the user clicks on save in create batch
    Then the user should see the create batch screen
    And the user clicks on the close create batch
    
    And the user clicks on create batch
    And the user adds a training name "<batch_trainingName>"
    And the user adds a training type "<batch_trainingType>"
    And the user adds a skill type "<batch_skillType>"
    And the user adds a location "<batch_location>"
    And the user adds a trainer "<batch_trainer>"
    And the user adds a cotrainer "<batch_cotrainer>"
    And the user adds a start date "<batch_startMonth>" "<batch_startDay>" "<batch_startYear>"
    And the user adds an end date "<batch_endMonth>" "<batch_endDay>" "<batch_endYear>"    
    And the user clicks on save in create batch
    Then the user should see the create batch screen
    And the user clicks on the close create batch
    

    Examples: 
      | batch_trainingName | batch_trainingType | batch_skillType | batch_location                                                                   | batch_trainer | batch_cotrainer | batch_startMonth | batch_startDay | batch_startYear | batch_endMonth | batch_endDay | batch_endYear | batch_goodGrade | batch_passingGrade |  |
      | neat               | Revature           | J2EE            | Tech Incubator at Queens College, 65-30 Kissena Blvd, CEP Hall 2 Queens NY 11367 |           123 | Name            |               01 |             01 |            2018 |             01 |           02 |          2018 |              80 |                 10 |  |

		















