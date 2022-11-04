package com.java;

import java.util.Arrays;
import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String branch;
	
	
	
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Student(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	public static List<Student> getAllStudentData(){
		return Arrays.asList(new Student(100, "Murari", "CSE"),new Student(101, "Divya", "EEE"),
				new Student(100, "Arjun", "ECE"),new Student(100, "Shekhar", "MECH"));
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
}
