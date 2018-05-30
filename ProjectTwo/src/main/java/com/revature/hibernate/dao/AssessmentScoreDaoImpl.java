package com.revature.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.hibernate.entity.Assessment;
import com.revature.hibernate.entity.AssessmentScore;
import com.revature.hibernate.util.HibernateUtil;

public class AssessmentScoreDaoImpl implements AssessmentScoreDao{

	
	private static AssessmentScoreDaoImpl instance;
	private AssessmentScoreDaoImpl() {}
	
	public static AssessmentScoreDaoImpl getInstance() {
		if (instance == null) {
			instance = new AssessmentScoreDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<AssessmentScore> getAllAssessmentScores() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from AssessmentScore", AssessmentScore.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}

	@Override
	public boolean insertAssessmentScore(AssessmentScore assessmentScore) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.save(assessmentScore);
			t.commit();
			System.out.println(assessmentScore.toString() + " successfully inserted");
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
	public boolean updateAssessmentScore(AssessmentScore assessmentScore) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			AssessmentScore temp = session.get(AssessmentScore.class, assessmentScore.getAssessmentScore_Id());
			//temp.setName(pokemon.getName());
			session.update(temp);
			t.commit();
			System.out.println(assessmentScore.toString() + " successfully updated");
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
	public boolean deleteAssessmentScore(AssessmentScore assessmentScore) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.delete(assessmentScore);
			t.commit();
			System.out.println(assessmentScore.toString() + " successfully deleted");
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
