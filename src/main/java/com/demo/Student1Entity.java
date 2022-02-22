package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.annotations.GeneratorType;

@Entity
public class Student1Entity {
	
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  public Student1Entity(String name, String email) {
	  super();
		this.name = name;
		this.email = email;
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public  Student1Entity() {
	super();
}

public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}

public String getEmail() {
	return email;
}

String name;
  String email;
}
