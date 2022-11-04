package com.java;

public class FactorsAndFactorial {

	public static void main(String[] args) {
		int num = 10;
		//5! = 5*4*3*2*1 = 120
		int factorial = 1;
		for(int i=num; i>=1; i--) {
			factorial = factorial*i;
		}
		System.out.println("factorial of "+num+" is "+factorial);

		System.out.print("factors of "+num+" is :");
		for(int i =1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	}


