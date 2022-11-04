package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23,454,25,231,56);
		System.out.println(list.stream().sorted().collect(Collectors.toList()).get(list.size()-2));

	}

}
