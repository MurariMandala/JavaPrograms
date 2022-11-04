package com.java;

public class RemoveAllOccurrencesOfA {

	public static void main(String[] args) {
		String str = "Java Programming";
		// remove all occurences of a 
		System.out.println("Before : "+str);
		str = str.replace("a", "");
		System.out.println("After : "+str);
	}

}
