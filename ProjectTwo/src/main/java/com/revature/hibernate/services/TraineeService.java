package com.revature.hibernate.services;

import java.util.List;

import com.revature.hibernate.dao.TraineeDao;
import com.revature.hibernate.dao.TraineeDaoImpl;
import com.revature.hibernate.entity.Trainee;

public class TraineeService {

	private static TraineeDao dao = TraineeDaoImpl.getInstance();
	private TraineeService() {}
	
	public static List<Trainee> getAllTrainees() {
		return dao.getAllTrainees();
	}
	
	public static boolean insertTrainee(Trainee trainee)  {
		return dao.insertTrainee(trainee);
	}
	
	public static boolean updateTrainee(Trainee trainee) {
		return dao.updateTrainee(trainee);
	}
	
	public static boolean deleteTrainee(Trainee trainee) {
		return dao.deleteTrainee(trainee);
	}
}
