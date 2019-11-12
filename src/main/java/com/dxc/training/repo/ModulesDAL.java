package com.dxc.training.repo;

import java.util.List;

import com.dxc.training.model.Modules;

public interface ModulesDAL {
	Modules save(Modules m);
	
	List<Modules> findAll();
}
