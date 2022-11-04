package com.java;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(345, "Murari");
		map.put(435, "Raju");
		map.put(134, "Ajay");
		map.put(54, "Mahesh");

		Map<Student,Integer> map1 = new HashMap<>();
		map1.put(new Student(100, "Murari", "CSE"),432);
		map1.put(new Student(101, "Divya", "EEE"),643);
		map1.put(new Student(102, "Arjun", "ECE"),576);
		map1.put(new Student(103, "Shekhar", "MECH"),786);
		
//		map.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, String>>() {
//			@Override
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				return o1.getValue().compareTo(o2.getValue());
//			}
//		}).forEach(System.out::println);
//		
	map.entrySet().stream().sorted((k,v)->v.getValue().compareTo(k.getValue())).forEach(System.out::println);
//		
//		map1.entrySet().stream().sorted(new Comparator<Map.Entry<Student, Integer>>() {
//			@Override
//			public int compare(Entry<Student, Integer> o1, Entry<Student, Integer> o2) {
//				return o1.getKey().getName().compareTo(o2.getKey().getName());
//			}
//		}).forEach(System.out::println);
//		
	//	map1.entrySet().stream().sorted((k,v)->v.getKey().getName().compareTo(k.getKey().getName())).forEach(System.out::println);
		
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName).reversed())).forEach(System.out::println);
	}

}
