package com.java;

public class PrintPyramidPattern {

	public static void main(String[] args) {

		int noOfLines = 9;
		printPyramidPattern(noOfLines);
		
	}
	
	static void printPyramidPattern(int noOfLines){
		
		for(int i=1; i<=noOfLines; i++) {
			int noOfSpaces = noOfLines-i;
			for(int j=1; j<=noOfSpaces; j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i; k++){
				System.out.print(i+" ");				
			}
			System.out.println();
		}
		
	}

}
