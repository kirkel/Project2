package com.revature.hibernate.dao;

import java.util.List;

import com.revature.hibernate.entity.Trainee;

public class TraineeDaoImpl implements TraineeDao{

	private static TraineeDaoImpl instance;
	private TraineeDaoImpl() {}
	
	public static TraineeDaoImpl getInstance() {
		if (instance == null) {
			instance = new TraineeDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return false;
	}

}
