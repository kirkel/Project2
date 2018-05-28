package com.revature.hibernate.dao;

import java.util.List;

import com.revature.hibernate.entity.Week;

public class WeekDaoImpl implements WeekDao{

	private static WeekDaoImpl instance;
	private WeekDaoImpl() {}
	
	public static WeekDaoImpl getInstance() {
		if (instance == null) {
			instance = new WeekDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<Week> getAllWeeks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertWeek(Week week) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateWeek(Week week) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteWeek(Week week) {
		// TODO Auto-generated method stub
		return false;
	}

}
