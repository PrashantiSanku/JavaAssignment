package com.org.main;

import java.util.Scanner;

public class ReverseInputString {

	public static void main(String[] args) {
		/*
		 * Write a Java program to reverse the input string. 
E.g., if the input string is “Pradeep" then the it should print “peedarP" .

		 */
		
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		String outputString = "";
		
		int lengthOfString = inputString.length();
		
		for(int i = lengthOfString -1; i>=0 ; i--)
		{
			outputString = outputString + inputString.charAt(i);
		}
		
		System.out.println("Reverse String: " + outputString);

	}

}
