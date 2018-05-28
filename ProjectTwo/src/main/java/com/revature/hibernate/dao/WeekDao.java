package com.revature.hibernate.dao;

import java.util.List;

import com.revature.hibernate.entity.Week;

public interface WeekDao {

	public List<Week> getAllWeeks();
	public boolean insertWeek(Week week);
	public boolean updateWeek(Week week);
	public boolean deleteWeek(Week week);
}
