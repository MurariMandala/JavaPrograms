package com.java;

public class PalindromeCheck {

	public static void main(String[] args) {

		String str = "abbas";
		str = str.toLowerCase();
		System.out.println(isPalindrome(str));
	}

	static boolean isPalindrome(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		String str1 = sb.reverse().toString();
		if(str.equals(str1)) {
			return true;
		}
		return false;
	}
}
