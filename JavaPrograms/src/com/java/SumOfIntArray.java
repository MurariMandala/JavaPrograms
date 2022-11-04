package com.java;

import java.util.Arrays;
import java.util.List;

public class SumOfIntArray {

	public static void main(String[] args) {
		
		int[] intArr = {2,4,7,9,3};

		int sum=0;
		for(int i=0; i<=intArr.length-1; i++) {
			sum = sum+intArr[i];
		}
		System.out.println("Sum : "+sum);
		
		System.out.println("Sum using streams : "+Arrays.stream(intArr).sum());
		
		List<Integer> intList = Arrays.asList(2,4,7,9,3);
		System.out.println("Sum using streams1 : "+intList.stream().mapToInt(i->i).sum());
		System.out.println("Sum using streams2 : "+intList.stream().mapToInt(Integer::intValue).sum());
	}

}
