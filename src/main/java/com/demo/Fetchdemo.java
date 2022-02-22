package com.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdemo {

	public static void main(String[] args)throws IOException {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.getCurrentSession();
        Date date=new Date(); 
        FileInputStream fis=new FileInputStream("Pictures/Screenshot(6)");
        byte[] data=new byte[fis.available()];
        fis.read();
		Address ad =new Address();
		ad.setImage(data);
		ad.setCity("banglore");
		ad.setHno(122.2);
		ad.setOpen(true);
		ad.setStreet("wilson garden");
		ad.setAdd_date(date);
		
		System.out.println(ad);
		session.beginTransaction();
		session.save(ad);
		session.getTransaction().commit();
		session.close();
		
	}
}
