package com.java;

public class TestClass1 {

	public static void main(String[] args) {
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.print(x);
		
		int n = 6;
		for(int i=1;i<=100;i++) {

			if(isPrime(i)) {
				//System.out.print(i+",");				
			}
		}
	}
	
	static boolean isPrime(int n) {
		
		if(n==0||n==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		
		return true;
	}

}
