package com.dxc.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.training.model.Modules;
import com.dxc.training.repo.ModulesDAL;


@RestController
public class ModulesController {
	@Autowired
	private ModulesDAL modDAL;
	
	@PostMapping("/modules")
	public void create(@RequestBody Modules m){
		modDAL.save(m);
	}
	@GetMapping("/modules")
	public List<Modules> findAll(){
		return modDAL.findAll();
	}
}
