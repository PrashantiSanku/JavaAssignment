package com.org.main;

import java.util.Scanner;

public class ReverseWordInString {

	public static void main(String[] args) {
		
		// Reverse the words in String
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Original String: ");
		
		String originalStr = s.nextLine();
		s.close();
		
		String words[] = originalStr.split("\\s");
		String reversedString = "";
		
		//Reverse each word's position
		for(int i = 0; i< words.length; i++)
		{
			if (i == words.length-1)
				reversedString = words[i] + reversedString;
			else
				reversedString = " " + words[i] + reversedString;
		}
		
		// Displaying the string after reverse
		
		System.out.print("Reversed String : " + reversedString);

	}

}
