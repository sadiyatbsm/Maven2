package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {

	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int id;
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String city;
	
	private Certificate certi;
	public Certificate getCerti() {
		return certi;
		
	}
	public void setCerti(Certificate certi) {
		this.certi=certi;
	}
	public StudentEntity(String name,String city,Certificate certi) {
		super();
		this.name=name;
		this.city=city;
		this.certi=certi;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentEntity(String name,String city) {
		super();
		this.city=city;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	
}
