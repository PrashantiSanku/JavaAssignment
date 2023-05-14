package com.org.main;
public class Calculator {

	/* Step 1:

Create a Java class with the name Calculator.java with 4 functions. addition, subtraction, multiplication and division
All these functions should take two integer parameters as input and return type of function should be integer.
 */
	
	public int addition (int a, int b)
	{
		int c = a + b;
		System.out.println("Addition : " + c);
		return c;
	}
	
	public int subtraction (int a, int b)
	{
		int c = a - b;
		System.out.println("Subtraction : " + c);
		return c;
	}
	
	public int multiplication (int a, int b)
	{
		int c = a * b;
		System.out.println("Multiplication : " + c);
		return c;
	}
	
	public int division (int a, int b)
	{
		int c = a / b;
		System.out.println("Division : " + c);
		return c;
	}
	
	public static void main(String args[])
	{
		Calculator cal1 = new Calculator();
		cal1.addition(5, 4);
		cal1.subtraction(12, 4);
		cal1.multiplication(5, 6);
		cal1.division(15, 3);
	}

}
