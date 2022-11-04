package com.java;

import java.util.Arrays;

public class TwoListContainsSameEle {

	public static void main(String[] args) {

		int arr1[] = { 3, 5, 2, 5, 2 };
		int arr2[] = { 2, 3, 5, 5, 2 };

		Arrays.sort(arr1);
		Arrays.sort(arr2);
	
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("contains same elements");
		}
	}

}
