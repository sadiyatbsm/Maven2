package com.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
public class Fetch {

	public static void main(String[] args) {
		 Configuration cfg= new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory factory=cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 
		 StudentEntity stu =(StudentEntity) session.get(StudentEntity.class, 1);
		 System.out.println(stu.getCity());
		 
		 Student1Entity stu1 =(Student1Entity) session.get(Student1Entity.class, 1);
		 System.out.println(stu1.getEmail());
		 
		 Address ad=(Address) session.load(Address.class, 1);
		 System.out.println(ad.getStreet());
		 
		 session.close();
		 factory.close();
	}
}
