package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(22,43,565,86,74,73,34,845);
		List<Integer> evenList = list.stream().filter(even -> even>50).collect(Collectors.toList());
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sdfsf");
		map.put(2, "dfgf");
		map.put(3, "hfgh");
		map.put(4, "hjhff");
		map.entrySet().stream().filter(f->f.getValue().contains("fgf")).forEach(e->System.out.println(e));
		
		String str = "Javasdf";
		
		Stream.of(str).filter(s->s.contains("Java")).forEach(e->System.out.println(e));
//		Collections.sort(list);
		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
//		System.out.println(list.get(2));
//		System.out.println(list.stream().mapToInt(Integer :: intValue).sum());
//		int total = 0;
//		for(Integer intVal : list) {
//			total = total+intVal;
//		}
//		System.out.println(total);
//		
		List<Integer> arr=  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(arr);
		List<Student> students = Student.getAllStudentData();
//		Collections.sort(students, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		//Collections.sort(students, (s1,s2)->s2.getName().compareTo(s1.getName()));
	//	students.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).forEach(System.out::println);
		
		students.stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(System.out::println);
	}

}

 class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
