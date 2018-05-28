package com.revature.hibernate.services;

import java.util.List;

import com.revature.hibernate.dao.BatchDao;
import com.revature.hibernate.dao.BatchDaoImpl;
import com.revature.hibernate.entity.Batch;

public class BatchService {

	
	private static BatchDao dao = BatchDaoImpl.getInstance();
	private BatchService() {}
	
	public static List<Batch> getAllBatches() {
		return dao.getAllBatches();
	}
	
	public static boolean insertBatch(Batch batch)  {
		return dao.insertBatch(batch);
	}
	
	public static boolean updateBatch(Batch batch) {
		return dao.updateBatch(batch);
	}
	
	public static boolean deleteBatch(Batch batch) {
		return dao.deleteBatch(batch);
	}
}
