package com.dxc.training.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.training.model.Modules;


@Repository
public class ModulesDALImp implements ModulesDAL{
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Modules> findAll() {
		return mongo.findAll(Modules.class);
	}
	
	@Override
	public Modules save(Modules mod){
		return mongo.save(mod);
	}
}
