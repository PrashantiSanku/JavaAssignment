package com.org.main;

import java.util.Scanner;

public class ReturnOccurringInput {

	public static void main(String[] args) {
		/*
		 * Write a Java program to return the occurring of a input character in the input string. 
E.g., if the input character is ‘a’ and input string is “Sarita" then the function should return 2.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		char inputCharacter = 'a';
		int charCount = 0;
		char ch;
		
		int lengthOfString = inputString.length();
		for(int i = 0; i < lengthOfString; i++)
		{
			ch = inputString.charAt(i);
			if(ch == inputCharacter)
			{
				charCount ++;
				
			}
		}
		System.out.println("Character Count: " + charCount);
		
		
		
		
		

	}

}
