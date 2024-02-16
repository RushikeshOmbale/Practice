package com.codingpractice.in;

public class NullPointerExceptionExample {
	
	public static void main(String[] args) {
		
		
		String s =null;
		String modifiedstring=null;
		
		//System.exit(0);
		
		try {
		 modifiedstring=s.concat("ombale");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		
		finally
		{
			System.out.println("excute");
		}
		System.out.println("the new string is "+modifiedstring);
	}
	

}
