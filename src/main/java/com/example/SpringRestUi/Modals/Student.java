package com.example.SpringRestUi.Modals;

public class Student {
	private int id,rollno;
	private String name;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, int rollno, String name) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
	}
	
	

}
