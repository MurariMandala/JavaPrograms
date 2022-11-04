package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersList {

	public static void main(String[] args) {
		List<Integer> intArr = Arrays.asList(2,4,5,7,8,19);
		
		System.out.println("List contains odd numbers? "+intArr.stream().anyMatch(x -> x % 2 != 0));
		System.out.println("Odd numbers list : "+intArr.stream().filter(a->a%2!=0).collect(Collectors.toList()));
		System.out.println("Even numbers list : "+intArr.stream().filter(a->a%2==0).collect(Collectors.toList()));
		System.out.println("Sum of all odd numbers : "+intArr.stream().filter(a->a%2!=0).mapToInt(i->i).sum());
		
	}

}
