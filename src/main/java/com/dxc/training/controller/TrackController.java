package com.dxc.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.training.model.Track;
import com.dxc.training.repo.TrackDAL;


@RestController
public class TrackController {
	@Autowired
	private TrackDAL trckDAL;
	
	@PostMapping("/track")
	public void create(@RequestBody Track m){
		trckDAL.save(m);
	}
	@GetMapping("/track")
	public List<Track> findAll(){
		return trckDAL.findAll();
	}
}
