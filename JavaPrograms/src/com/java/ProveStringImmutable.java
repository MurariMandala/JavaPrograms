package com.java;

public class ProveStringImmutable {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = s1;
		System.out.println("1st : "+s1==s2);
		
		s1 = "Python";
		System.out.println("1st : "+s1==s2);
		
	}

}
