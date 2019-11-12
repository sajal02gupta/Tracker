package com.dxc.training.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="/batch")
public class Batch {
	@Id
	private String id;
	private String name;
	
	@DBRef
	private Track track;
	
	@DBRef
	private List<Employee> employee;
	
	@CreatedDate
	private Date createdDate = new Date();
	
	@LastModifiedDate
	private Date LastModifiedDate= new Date();
	
	public Batch(String aa, String a, Track b, List<Employee> c){
		this.id=aa;
		this.name=a;
		this.track=b;
		this.employee=c;
	}
	public Batch(){
		
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModifiedDate() {
		return LastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		LastModifiedDate = lastModifiedDate;
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

	public Track getTrack() {
		return track;
	}

	public void setTrack(Track track) {
		this.track = track;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
