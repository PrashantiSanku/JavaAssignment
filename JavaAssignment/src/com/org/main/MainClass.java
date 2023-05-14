package com.org.main;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int res1 = cal.addition(8, 4);
		
		int res2 = cal.subtraction(8, 4);
		
		int finalRes = cal.multiplication(res1, res2);
		
		System.out.println("Final Result : " + finalRes);
		
		
		

	}

}
