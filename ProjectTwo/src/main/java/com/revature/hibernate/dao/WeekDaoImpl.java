package com.revature.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.hibernate.entity.Assessment;
import com.revature.hibernate.entity.Week;
import com.revature.hibernate.util.HibernateUtil;

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
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Week", Week.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}

	@Override
	public boolean insertWeek(Week week) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.save(week);
			t.commit();
			System.out.println(week.toString() + " successfully inserted");
			return true;
		} catch (HibernateException hbe) {
			if (t != null) {
				t.rollback();
				System.out.println("Transaction successfully rolled back");
			}
			hbe.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session successfully closed: " + !session.isOpen());
			}
		}
		return false;
	}


	@Override
	public boolean updateWeek(Week week) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			Week temp = session.get(Week.class, week.getWeek_Id());
			//temp.setName(pokemon.getName());
			session.update(temp);
			t.commit();
			System.out.println(week.toString() + " successfully updated");
			return true;
		} catch (HibernateException hbe) {
			if (t != null) {
				t.rollback();
				System.out.println("Transaction successfully rolled back");
			}
			hbe.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session successfully closed: " + !session.isOpen());
			}
		}
		return false;
	}
	@Override
	public boolean deleteWeek(Week week) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.delete(week);
			t.commit();
			System.out.println(week.toString() + " successfully deleted");
			return true;
		} catch (HibernateException hbe) {
			if (t != null) {
				t.rollback();
				System.out.println("Transaction successfully rolled back");
			}
			hbe.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session successfully closed: " + !session.isOpen());
			}
		}
		return false;
	}

}

