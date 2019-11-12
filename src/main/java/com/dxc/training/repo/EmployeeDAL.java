package com.dxc.training.repo;

import java.util.List;

import com.dxc.training.model.Employee;

public interface EmployeeDAL {
	Employee save(Employee e);
	
	List<Employee> findAll();
}
