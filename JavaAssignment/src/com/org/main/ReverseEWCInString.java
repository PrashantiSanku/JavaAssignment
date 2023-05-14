package com.org.main;

import java.util.Scanner;

public class ReverseEWCInString {

	public static void main(String[] args) {
		//Reverse each word's characters in string
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Original String : ");
		String originalStr = s.nextLine();
		s.close();
		
		String words[] = originalStr.split("\\s");
		String reversedString = "";
		
		for(int i =0; i<words.length; i++)
		{
			String word = words[i];
			String reverseWord = "";
			for(int j = word.length()-1; j>=0;j--)
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		
		//Displaying the string after reverse
		System.out.print("Reversed String : " + reversedString);
		

	}

}
