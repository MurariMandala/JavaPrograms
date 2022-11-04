package com.java;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(5)); // true
		System.out.println(isPrime(49)); // false
	
		// find all prime numbers from 1-100
		for(int i=1;i<=100;i++) {
			if(isPrime(i)) {
				System.out.print(i+",");
			}
		}
		
	}
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
