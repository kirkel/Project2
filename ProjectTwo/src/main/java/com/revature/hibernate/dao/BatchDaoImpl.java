package com.revature.hibernate.dao;

import java.util.List;

import com.revature.hibernate.entity.Batch;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertBatch(Batch batch) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBatch(Batch batch) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBatch(Batch batch) {
		// TODO Auto-generated method stub
		return false;
	}

}
