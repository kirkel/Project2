package com.revature.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.hibernate.entity.Batch;
import com.revature.hibernate.util.HibernateUtil;

public class BatchDaoImpl implements BatchDao{

	private static BatchDaoImpl instance;
	private BatchDaoImpl() {}
	
	public static BatchDaoImpl getInstance() {
		if (instance == null) {
			instance = new BatchDaoImpl();
		}
		return instance;
	}
	
	
	@Override
	public List<Batch> getAllBatches() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Batch order by batch_Id", Batch.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}
	@Override
	public boolean insertBatch(Batch batch) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.save(batch);
			t.commit();
			System.out.println(batch.toString() + " successfully inserted");
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
	public boolean updateBatch(Batch batch) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			Batch temp = session.get(Batch.class, batch.getBatch_Id());
			//temp.setName(pokemon.getName());
			session.update(temp);
			t.commit();
			System.out.println(batch.toString() + " successfully updated");
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
	public boolean deleteBatch(Batch batch) {
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.delete(batch);
			t.commit();
			System.out.println(batch.toString() + " successfully deleted");
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
	public Batch getBatch(String trainingName) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Batch where trainingName like :trainingName", Batch.class).setParameter("trainingName", trainingName).getSingleResult();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}

}