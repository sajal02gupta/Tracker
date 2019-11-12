package com.dxc.training.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.training.model.Batch;

@Repository
public class BatchDALImp implements BatchDAL{
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Batch> findAll(){
		return mongo.findAll(Batch.class);
	}
	
	@Override
	public Batch save(Batch emp){
		return mongo.save(emp);
	}
}
