package com.revature.application;

import java.util.List;

import com.revature.hibernate.entity.Assessment;
import com.revature.hibernate.entity.AssessmentScore;
import com.revature.hibernate.entity.Batch;
import com.revature.hibernate.entity.Trainee;
import com.revature.hibernate.entity.Week;
import com.revature.hibernate.enums.AssessmentCategory;
import com.revature.hibernate.enums.AssessmentType;
import com.revature.hibernate.enums.FlagColor;
import com.revature.hibernate.enums.SkillType;
import com.revature.hibernate.enums.Trainer;
import com.revature.hibernate.enums.TrainingLocation;
import com.revature.hibernate.enums.TrainingStatus;
import com.revature.hibernate.enums.TrainingType;
import com.revature.hibernate.services.AssessmentScoreService;
import com.revature.hibernate.services.AssessmentService;
import com.revature.hibernate.services.BatchService;
import com.revature.hibernate.services.TraineeService;
import com.revature.hibernate.services.WeekService;

public class Application {

	public static void main(String[] args) {
		
		generateBatch(1, 3, false);
		List<Batch> batchList = BatchService.getAllBatches();
		Batch currentBatch = batchList.get(batchList.size() - 1);
		generateWeekWithAssessments(currentBatch, 1, false, 2, false);
//		generateAllAssessmentScores();

		
	}

	// Default random trainees: 5 to 15
	public static void generateBatch(int batches, int traineessPerBatch, boolean randomNumTraineesPerBatch) {
		Batch randomBatch = new Batch("Best Batch Ever", TrainingLocation.NY, TrainingType.REVATURE, 
				SkillType.JTA, Trainer.RYAN, null, 4, 16, 2018, 6, 23, 2018, 100, 80);
		Trainee randomTrainee = new Trainee("Adam", FlagColor.GREEN, "Wow the flag works!", 
				"neat@gmail.com", TrainingStatus.CONFIMRED, 4191234567L, "", 
				"BGSU", "BS", "Physics", "Neat", "Person", 80.0f, "", randomBatch);
		
		for(int i = 0; i < batches; i++) {
			if(randomNumTraineesPerBatch)
				traineessPerBatch = GenerateData.getRandomInt(5, 15);
			randomBatch.setTrainingName(GenerateData.getRandomString());
			randomBatch.setTrainingLocation(TrainingLocation.getRandom());
			randomBatch.setTrainingType(TrainingType.getRandom());
			randomBatch.setSkillType(SkillType.getRandom());
			randomBatch.setTrainer(Trainer.PATRICK);
			randomBatch.setCotrainer(Trainer.getRandom());
			randomBatch.setStart_day(GenerateData.getRandomInt(1, 28));
			randomBatch.setStart_month(GenerateData.getRandomInt(1, 6));
			randomBatch.setStart_year(2016);
			randomBatch.setEnd_day(GenerateData.getRandomInt(1, 28));
			randomBatch.setEnd_month(GenerateData.getRandomInt(7, 12));
			randomBatch.setEnd_year(2016);
			randomBatch.setGoodGrade(100);
			randomBatch.setPassingGrade(80);
			System.out.println(randomBatch);
			System.out.println("Batch inserted successfully? " + BatchService.insertBatch(randomBatch));
			randomBatch = BatchService.getBatch(randomBatch.getTrainingName());
			for(int j = 0; j < traineessPerBatch; j++) {
				System.out.println(GenerateData.getRandomString());
				randomTrainee.setFullName(GenerateData.getRandomString());
				randomTrainee.setFlagColor(FlagColor.getRandom());
				randomTrainee.setFlagNotes(GenerateData.getRandomString());
				randomTrainee.setEmail(GenerateData.getRandomString().concat("@neat.com"));
				randomTrainee.setStatus(TrainingStatus.getRandom());
				randomTrainee.setPhonenumber(1234567890L);
				randomTrainee.setSkypeId("");
				randomTrainee.setCollege(GenerateData.getRandomString());
				randomTrainee.setDegree(GenerateData.getRandomString());
				randomTrainee.setMajor(GenerateData.getRandomString());
				randomTrainee.setRecruiterName(GenerateData.getRandomString());
				randomTrainee.setTechScreenerName(GenerateData.getRandomString());
				randomTrainee.setProjectCompletion(80.0f);
				randomTrainee.setProfileUrl("");
				randomTrainee.setBatch(randomBatch);
				
				System.out.println(randomTrainee);
				System.out.println("Trainee inserted successfully? " + TraineeService.insertTrainee(randomTrainee));
			}
		}
	}
	
	// Default random weeks: between 5 and 10
	// Default random assessments: 1 to 5
	public static void generateWeekWithAssessments(Batch batch, int numWeeks, boolean randomNumOfWeeks, int assessmentsPerWeek, boolean randomNumAssessmentsPerWeek) {
		Week week = new Week(GenerateData.getRandomString(), batch);
		Assessment newAssessment = new Assessment(AssessmentCategory.getRandom(), GenerateData.getRandomInt(10, 100), AssessmentType.getRandom(), week);
		if(randomNumOfWeeks)
			numWeeks = GenerateData.getRandomInt(5, 10);
		for(int i = 0; i < numWeeks; i++) {
			if(randomNumAssessmentsPerWeek)
				assessmentsPerWeek = GenerateData.getRandomInt(1, 5);
			week.setOverallFeedback(GenerateData.getRandomString());
			week.setBatch(batch);
			System.out.println(week);
			System.out.println("Week inserted successfully? " + WeekService.insertWeek(week));
			List<Week> weeks = WeekService.getAllWeeks();
			week = weeks.get(weeks.size() - 1);
			for(int j = 0; j < assessmentsPerWeek; j++) {
				newAssessment.setCategory(AssessmentCategory.getRandom());
				newAssessment.setType(AssessmentType.getRandom());
				newAssessment.setMaxPoints(GenerateData.getRandomInt(10, 100));
				newAssessment.setWeek(week);
				System.out.println(newAssessment);
				System.out.println("Assessment inserted? " + AssessmentService.insertAssessment(newAssessment));
			}
		}
	}
	
	public static void generateAllAssessmentScores() {
		List<Week> weekList = WeekService.getAllWeeks();
		List<Assessment> assessmentList = AssessmentService.getAllAssessments();
		List<Trainee> traineeList = TraineeService.getAllTrainees();
		List<Batch> batchList = BatchService.getAllBatches();
		Assessment currentAssessment = assessmentList.get(assessmentList.size() - 1);
		Trainee currentTrainee = traineeList.get(traineeList.size() - 1);
		Week currentWeek = weekList.get(weekList.size() - 1);
		Batch currentBatch = batchList.get(batchList.size() - 1);
		AssessmentScore assessmentScore = new AssessmentScore(GenerateData.getRandomInt(10, 100), currentAssessment, currentTrainee);
		
		for(int i = 0; i < batchList.size(); i++) {
			currentBatch = batchList.get(i);
			for(int j = 0; j < traineeList.size(); j++) {
				currentTrainee = traineeList.get(j);
//				System.out.println("The current batchId is " + currentBatch.getBatch_Id() + " and the trainee batchId is " + currentTrainee.getBatch().getBatch_Id() + " for traineeId "+ currentTrainee.getTrainee_Id());
				if(currentTrainee.getBatch().getBatch_Id() == currentBatch.getBatch_Id()) {
					for(int k = 0; k < weekList.size(); k ++) {
						currentWeek = weekList.get(k);
//						System.out.println("The current batchId is still " + currentBatch.getBatch_Id() + " and the week batchId is " + currentWeek.getBatch().getBatch_Id() + " for weekId " + currentWeek.getWeek_Id());
						if(currentWeek.getBatch().getBatch_Id() == currentBatch.getBatch_Id()) {
							for(int n = 0; n < assessmentList.size(); n++) {
								currentAssessment = assessmentList.get(n);
//								System.out.println("The current weekId is still " + currentWeek.getWeek_Id() + " and the assessment weekId is " + currentAssessment.getWeek().getWeek_Id() + " for assessment " + currentAssessment.getAssessment_Id());
								if(currentAssessment.getWeek().getWeek_Id() == currentWeek.getWeek_Id()) {
										assessmentScore.setScore(GenerateData.getRandomInt(10, 100));
										assessmentScore.setTrainee(currentTrainee);
										assessmentScore.setAssessment(currentAssessment);
										System.out.println("Assessment Score insert? " + AssessmentScoreService.insertAssessmentScore(assessmentScore));	
								}
							}
						}
					}
				}
			}
		}
	}
	
	
}
