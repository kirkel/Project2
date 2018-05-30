package com.revature.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.hibernate.entity.Assessment;
import com.revature.hibernate.entity.Trainee;
import com.revature.hibernate.util.HibernateUtil;

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
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Trainee", Trainee.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}

	@Override
	public boolean insertTrainee(Trainee trainee) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.save(trainee);
			t.commit();
			System.out.println(trainee.toString() + " successfully inserted");
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
	public boolean updateTrainee(Trainee trainee) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			Trainee temp = session.get(Trainee.class, trainee.getTrainee_Id());
			//temp.setName(pokemon.getName());
			session.update(temp);
			t.commit();
			System.out.println(trainee.toString() + " successfully updated");
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
	public boolean deleteTrainee(Trainee trainee) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.delete(trainee);
			t.commit();
			System.out.println(trainee.toString() + " successfully deleted");
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