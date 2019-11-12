package com.dxc.training.model;

public class Assessments {
	private String id;
	private String name;
	private String marks;
	private String grade;
	
	public Assessments(){}
	
	public Assessments(String d, String a, String b, String c){
		this.id= d;
		this.name=a;
		this.marks=b;
		this.grade=c;
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

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
