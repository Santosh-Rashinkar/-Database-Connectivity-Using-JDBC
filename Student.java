package com.prowings;

public class Student {
	
	private int id;
	private String name;
	private String address;
	private int  marks;
	private String subject;
	private int rollNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( String name,int id, String address, int marks, String subject, int rollNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
		this.subject = subject;
		this.rollNo = rollNo;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + ", subject="
				+ subject + ", rollNo=" + rollNo + "]";
	}

	
}

