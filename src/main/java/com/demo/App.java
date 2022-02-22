package com.demo;


import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App {

	public static void main(String[] args) throws IOException{
		System.out.println("Project Started");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		System.out.println(factory.isClosed());
		
		Student1Entity st=new Student1Entity("Noor","noor1@gmail.com");
		System.out.println(st);
		session.beginTransaction();
		session.save(st);
		session.getTransaction().commit();
		session.close();
		
	}

}
