package com.dxc.training.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class Track {
	private String id;
	private String name;
	
	@DBRef
	private List<Modules> module;
	
	public Track(){}
	
	public Track( String a, String b, List<Modules> module){
		this.id=a;
		this.name=b;
		this.module=module;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Modules> getModule() {
		return module;
	}

	public void setModule(List<Modules> module) {
		this.module = module;
	}
	
}
