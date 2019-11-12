package com.dxc.training.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.training.model.Assessments;

@Repository
public class AssessmentsDALImp implements AssessmentsDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Assessments> findAll(){
		return mongo.findAll(Assessments.class);
	}
	
	@Override
	public Assessments save(Assessments assess){
		return mongo.save(assess);
	}
}
