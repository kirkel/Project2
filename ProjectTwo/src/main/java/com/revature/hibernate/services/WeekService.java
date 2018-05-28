package com.revature.hibernate.services;

import java.util.List;

import com.revature.hibernate.dao.WeekDao;
import com.revature.hibernate.dao.WeekDaoImpl;
import com.revature.hibernate.entity.Week;

public class WeekService {
	private static WeekDao dao = WeekDaoImpl.getInstance();
	private WeekService() {}
	
	public static List<Week> getAllWeeks() {
		return dao.getAllWeeks();
	}
	
	public static boolean insertWeek(Week week)  {
		return dao.insertWeek(week);
	}
	
	public static boolean updateWeek(Week week) {
		return dao.updateWeek(week);
	}
	
	public static boolean deleteWeek(Week week) {
		return dao.deleteWeek(week);
	}
}
