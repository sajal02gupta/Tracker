package com.dxc.training.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.training.model.Employee;

@Repository
public class EmployeeDALImp implements EmployeeDAL{
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Employee> findAll(){
		return mongo.findAll(Employee.class);
	}
	
	@Override
	public Employee save(Employee emp){
		return mongo.save(emp);
	}

}
