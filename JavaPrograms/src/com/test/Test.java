package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



class Empoyee{
	private String id;
	private String name;
	private double salary;
	public Empoyee(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class Test {

	public static void main(String[] args) {
		List<Empoyee> empList = new ArrayList<>();
		Empoyee emp = new Empoyee("111", "ABC", 1000);
		Empoyee emp1 = new Empoyee("222", "XYZ", 1500);
		Empoyee emp2= new Empoyee("333", "MNO", 2000);
		Empoyee emp3 = new Empoyee("444", "PQR", 500);
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
//		System.out.println(empList.stream().filter().collect(Collectors.toList()));
		
		
		

	}

}
