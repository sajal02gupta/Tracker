package com.dxc.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.training.model.Assessments;
import com.dxc.training.repo.AssessmentsDAL;

@RestController
public class Assessmentcontroller {
	@Autowired
	private AssessmentsDAL assessDAL;
	
	@PostMapping("/assessments")
	public void create(@RequestBody Assessments a){
		assessDAL.save(a);
	}
	@GetMapping("/assessments")
	public List<Assessments> findAll(){
		return assessDAL.findAll();
	}
}
