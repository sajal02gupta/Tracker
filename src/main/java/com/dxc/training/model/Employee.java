package com.dxc.training.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Employee {
	private String name;
	
	@Id
	private String id;
	private List<Assessments> assessment;
	
	public Employee(){}
	
	public Employee(String a, String b, List<Assessments> c){
		this.name=a;
		this.id=b;
		this.assessment=c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Assessments> getAssessment() {
		return assessment;
	}

	public void setAssessment(List<Assessments> assessment) {
		this.assessment = assessment;
	}
	
}
