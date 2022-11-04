package com.java;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int n = 2;
		fibonacci(n);
		System.out.println("");
		System.out.println(fibonacciNumbers(n));
		
	}
	
	static void fibonacci(int n){
		int a = 0; //fib(1)
		int b = 1; //fib(2)
		int c = 1; //fib(3)
		// adding previous 2 numbers 
		//
		for (int i = 1; i <= n; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}
		
	}
	public static int fibonacciNumbers(int n) {
		if (n <= 1)
			return n;
		return fibonacciNumbers(n - 1) + fibonacciNumbers(n - 2);
	}

}
