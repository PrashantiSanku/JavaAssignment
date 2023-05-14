package com.org.main;

public class Overloading {
	
	
	public int add(int a, int b)
	{
		int c = a + b;
		System.out.println("Addition: " + c);
		return c;
	}
	
	public float add(int a, float b)
	{
		float c = a + b;
		System.out.println("Addition: " + c);
		return c;
	}
	
	public float add(float a, float b)
	{
		float c = a + b;
		System.out.println("Addition: " + c);
		return c;
	}

	public static void main(String[] args) {
		
		Overloading ov = new Overloading();
		ov.add(5, 6);
		ov.add(6, f(0.1243));
		
		

	}

}
