package com.org.main;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		
		//How to Take Input from User In Java Programming
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println("Sum: " + c);
		
		String s = sc.next();
		String h = sc.next();
		
		String p = s + h;
		
		System.out.println("Complete String: " + p);
		
				


	}

}
