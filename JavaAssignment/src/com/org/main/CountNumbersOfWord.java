package com.org.main;

import java.util.Scanner;

public class CountNumbersOfWord {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to count Number of Words in Given String

E.g., 
(1) input string  “Pradeep Chand Nailwal” output should be 3. 
(2) input string  “Sarita Nailwal” output should be 2. 
(3) input string  “Sarita  Nailwal” output should be 2. 
(4) input string  “Ram  Gopal  Verma” output should be 3. 
(5) input string  “ Ram  Gopal  Verma” output should be 3. 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String inputString = sc.nextLine();
		
		int count = 0;
		
		char ch[] = new char[inputString.length()];
		for(int i = 0; i <inputString.length(); i++)
		{
			ch[i] = inputString.charAt(i);
			if((i == 0 && ch[0]!=' ') || ((i>0&& (ch[i]!=' ') && (ch[i-1]==' ')) ))
					{
						count++;
					}
		}
		System.out.println("There are " + count + " words.");
	}

}
