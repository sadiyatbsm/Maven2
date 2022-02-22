package com.demo;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {
public static void main(String[] args)throws IOException {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session=factory.getCurrentSession();
	
	StudentEntity stu = new StudentEntity();
	
	stu.setCity("banglore");
	stu.setName("sadiya");
	
	Certificate cert = new Certificate("Python","4 month");
	stu.setCerti(cert);
	
	StudentEntity stu2=new StudentEntity();
	stu2.setCity("mummbai");
	stu2.setName("Sakshi");
	
	Certificate cert1=new Certificate("Hibernate","2 month");
	stu2.setCerti(cert1);
	
	Session s=factory.openSession();
	org.hibernate.Transaction tx = s.beginTransaction();
	s.save(stu);
	s.save(stu2);
	
	tx.commit();
	session.close();
}
}
