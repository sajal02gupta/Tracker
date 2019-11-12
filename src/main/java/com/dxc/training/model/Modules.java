package com.dxc.training.model;

import org.springframework.data.annotation.Id;

public class Modules {
	@Id
	private String id;
	private String name;
	private String description;
	
	public Modules(){}
	
	public Modules(String a, String b, String c){
		this.description=c;
		this.id=a;
		this.name=b;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
