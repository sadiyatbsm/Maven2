package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
	@Column(name="ans_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	private String answer;
	
	@Override
	public String toString() {
		return "Answer [aid=" + aid +", answer=" + answer + "]";
		
	}
	public Answer(int aid,String answer) {
		super();
		this.aid=aid;
		this.answer=answer;
		
		}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
