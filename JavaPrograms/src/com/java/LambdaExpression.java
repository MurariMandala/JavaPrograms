package com.java;

/**
 * 
 * Runnable
 * Callable
 * Comparator
 * Comparable
 *
 */
@FunctionalInterface
interface doCalculate{
	int sum(int a,int b);
	default void m1() {
	System.out.println("executed default method...");	
	}
	
}

public class LambdaExpression {

	public static void main(String[] args) {
			doCalculate calculate =(a,b)->{
				return a+b;
			};
			System.out.println(calculate.sum(2,5));
	}

}
