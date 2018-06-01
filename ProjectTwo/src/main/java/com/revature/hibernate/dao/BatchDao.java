package com.revature.hibernate.dao;

import java.util.List;

import com.revature.hibernate.entity.Batch;

public interface BatchDao {

	public List<Batch> getAllBatches();
	public Batch getBatch(String trainingName);
	public boolean insertBatch(Batch batch);
	public boolean updateBatch(Batch batch);
	public boolean deleteBatch(Batch batch);
}
