#Feature: A user wants to manage the batch
#
#		
#	Scenario Outline:
#		When a user clicks on the Manage Batch button
#		Then the user sees the Manage Batch Page
#		Given the user creates a new batch 
#		And has the training name "<training_name>" 
#		And has the training type "<training_type>"
#		And has the skill type "<skill_type>"
#		And has the location "<location>"
#		And has the trainer "<trainer>"
#		And has the co-trainer "<cotrainer>"
#		And has the start date day <start_day> and month <start_month> and year <start_year>
#		And has the end date day <end_day> and month <end_month> and year <end_year>
#		And has the good grade <grade_good>
#		And has the passing grade <grade_passing>
#		Then the user sees the new batch 
#		
#		Examples:
#			|training_name	|training_type	|skill_type	|location	|trainer	|cotrainer	|start_day|start_month|start_year	|end_day|end_month|end_year	|grade_good	|grade_passing|
#			|neatbatch			|Revature				|JTA				|NY				|Name			|123				|1				|1					|2017				|2			|2				|2017			|80					| 80|
