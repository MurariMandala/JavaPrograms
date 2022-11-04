package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingOnArrayList {

	public static List<Integer> sortArrayListInTreditionalWay(List<Integer> array) {

		array.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}

		});

		return array;
	}

	public static List<Integer> sortArrayListUsingLambdaExp(List<Integer> array) {
		array.sort((o1, o2) -> o1 - o2);
		return array;
	}
	
	public static List<Integer> sortArrayListUsingStreamsApi(List<Integer> array) {
		//array.stream().sorted();
	//	array.stream().sorted(Comparator.reverseOrder());
		array.stream().sorted((o1,o2)->o1-o2);
		return array;
	}	
	
	public static List<Student> sortObjInTreditionalWay(List<Student> students){
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		return students;
	}

	public static List<Student> sortObjUsingLamdaExp(List<Student> students){
		students.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
		return students;
	}
	
	public static List<Student> sortObjUsingStreams(List<Student> students){
		students.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName()));
	//	students.stream().sorted(Comparator.comparing(Student :: getName).reversed());
		return students;
	}
	
	public static void main(String[] args) {
		List<Integer> arrayList = Arrays.asList(867, 35, 65, 342, 645, 867, 342, 41, 345, 67);
		System.out.println("sortArrayListInTreditionalWay : " + SortingOnArrayList
				.sortArrayListInTreditionalWay(arrayList));
		
		System.out.println("sortArrayListUsingLambdaExp : " + SortingOnArrayList
				.sortArrayListUsingLambdaExp(arrayList));
		
		System.out.println("sortArrayListUsingStreamsApi : " + SortingOnArrayList
				.sortArrayListUsingStreamsApi(arrayList));
		
		System.out.println("Original Obj"+Student.getAllStudentData());
		
		System.out.println("sortArrayObjInTreditionalWay : " + SortingOnArrayList
				.sortObjInTreditionalWay(Student.getAllStudentData()));
		
		System.out.println("sortArrayObjUsingLambdaExp : " + SortingOnArrayList
				.sortObjInTreditionalWay(Student.getAllStudentData()));
		
		System.out.println("sortArrayObjUsingStreams : " + SortingOnArrayList
				.sortObjInTreditionalWay(Student.getAllStudentData()));
	}

}
