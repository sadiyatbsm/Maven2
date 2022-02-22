package com.map;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMappings {
public static void main(String[] args) {
	
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	
	Question Q1=new Question();
	Q1.setQues("What is java?");
	Question Q2=new Question();
	Q2.setQues("What is hibernate?");
	Answer ans = new Answer();
	ans.setAnswer("Java is a programming langguuage");
	Answer ans1 = new Answer();
	ans1.setAnswer("Hibernate is ORM Tool");
	Q1.setAns(ans);
	Q2.setAns(ans1);
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(ans);
	session.save(Q1);
	session.save(ans1);
	session.save(Q2);
	tx.commit();
	
	Question ques =(Question) session.load(Question.class, 2);
	System.out.println(ques.getQues());
	System.out.println(ques.getAns().getAnswer());
	
	session.close();
	factory.close();
	
}
}
