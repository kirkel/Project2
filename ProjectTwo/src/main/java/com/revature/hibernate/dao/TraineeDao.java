package com.revature.hibernate.dao;

import java.util.List;

import com.revature.hibernate.entity.Trainee;

public interface TraineeDao {

	public List<Trainee> getAllTrainees();
	public boolean insertTrainee(Trainee trainee);
	public boolean updateTrainee(Trainee trainee);
	public boolean deleteTrainee(Trainee trainee);
}
