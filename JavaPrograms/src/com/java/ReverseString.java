package com.java;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Java Programming";
		reverseString(str);

	}
	
	public static void reverseString(String str){
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		StringBuffer sb1 = new StringBuffer();
		char[] chArr = str.toCharArray();
		for(int i=chArr.length-1; i>=0; i--) {
			sb1.append(chArr[i]);
		}
		System.out.println(sb1);
	}

}
