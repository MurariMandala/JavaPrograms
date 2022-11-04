package com.java;

import java.util.ArrayList;
import java.util.List;

public class FindSpecialCharFromString {

	public static void main(String[] args) {
		
		String str = "Java@124#";
		usingContainsMethod(str);
		usingCharacterClass(str);
	}

	static void usingCharacterClass(String str) {
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
	}
	
	static void usingContainsMethod(String str) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		List<Character> list = new ArrayList<Character>();
		char[] chArr = s.toCharArray();
		for(int i=0;i<=chArr.length-1;i++) {
			list.add(chArr[i]);
		}
		for(int i=0; i<=str.length()-1;i++) {
			if(!list.contains(str.toUpperCase().charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
	}
}
