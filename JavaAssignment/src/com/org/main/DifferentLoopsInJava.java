package com.org.main;

import java.util.Scanner;

public class DifferentLoopsInJava {

	public static void main(String[] args) {
		
		
		/*
		 * Write Java Programs to print table of given number(Take number as input from user)

Part 1: Using for loop
Part 2: Using while loop
Part 3: Using do while loop

		 */
		// for loop
		/*Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int counter = 1; counter <=10; counter ++)
		{
			System.out.println(num + "*" + counter + "=" + (num * counter));
		}
		*/
		
		//using while loop
		
		/*Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int counter = 1;
		
		while(counter <=10)
		{
			System.out.println(num + "*" + counter + "=" + (num * counter));
			counter++;
		}
		*/
		
		//using do while loop
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int counter = 1;
		
		do
		{
			System.out.println(num + "*" + counter + "=" + (num * counter));
			counter++;
		}
		while(counter <=10);
		
	}

}
