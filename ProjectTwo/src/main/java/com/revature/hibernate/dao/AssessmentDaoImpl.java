package com.revature.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.hibernate.entity.Assessment;
import com.revature.hibernate.util.HibernateUtil;

public class AssessmentDaoImpl implements AssessmentDao{

	private static AssessmentDaoImpl instance;
	private AssessmentDaoImpl() {}
	
	public static AssessmentDaoImpl getInstance() {
		if (instance == null) {
			instance = new AssessmentDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<Assessment> getAllAssessments() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Assessment", Assessment.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}

	@Override
	public boolean insertAssessment(Assessment assessment) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.save(assessment);
			t.commit();
			System.out.println(assessment.toString() + " successfully inserted");
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
	public boolean updateAssessment(Assessment assessment) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			Assessment temp = session.get(Assessment.class, assessment.getAssessment_Id());
			//temp.setName(pokemon.getName());
			session.update(temp);
			t.commit();
			System.out.println(assessment.toString() + " successfully updated");
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
	public boolean deleteAssessment(Assessment assessment) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.delete(assessment);
			t.commit();
			System.out.println(assessment.toString() + " successfully deleted");
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
