package com.dxc.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.training.model.Batch;
import com.dxc.training.repo.BatchDAL;

@RestController
public class BatchController {
	@Autowired
	private BatchDAL batDAL;
	
	@PostMapping("/batch")
	public void create(@RequestBody Batch b){
		batDAL.save(b);
	}
	
	@GetMapping("/batch")
	public List<Batch> findAll(){
		return batDAL.findAll();
	}
}
