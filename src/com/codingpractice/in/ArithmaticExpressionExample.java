package com.codingpractice.in;

public class ArithmaticExpressionExample {
	
	public static void main(String[] args) {
		int dividend = 123;
		int divisor = 0;
		int result = 0;
		
		try
		{
			result=dividend/divisor;
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("cannot divide by zero");
		}
		System.out.println(result);
	}
}
	
	

