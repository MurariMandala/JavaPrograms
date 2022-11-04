package com.java;

import java.util.Scanner;

public class Strings {

	private static String reverseAString(String str) {
		System.out.println("Before reverse the String = " + str);
		//1
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String After reverse = " + sb.reverse());
		
		//2
		String s1 = null;
		for(int i=0;i<str.length();i++) {
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter a String ");
		reverseAString("Java Programming");

	}

}
