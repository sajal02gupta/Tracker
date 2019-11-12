package com.dxc.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.training.model.Employee;
import com.dxc.training.repo.EmployeeDAL;


@RestController 
public class EmployeeController {
	@Autowired
	private EmployeeDAL empDAL;
	
	@PostMapping("/employee")
	public void create(@RequestBody Employee e){
		empDAL.save(e);
	}
	
	@GetMapping("/employee")
	public List<Employee> findAll(){
		return empDAL.findAll();
	}
}
