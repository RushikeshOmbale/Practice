package com.codingpractice.in;

public class Singletonexample {
	
	static Singletonexample s = null;
	
	
	private Singletonexample()
	{
		
	}
	
	public static Singletonexample getinstance()
	{
		if(s==null)
		{
			s= new Singletonexample();
			
		}
		return s;
	}
	
	public static void main(String[] args) {
    
		Singletonexample s1 =Singletonexample.getinstance();
		System.out.println(s1.hashCode());
		Singletonexample s2 =Singletonexample.getinstance();
		System.out.println(s2.hashCode());
		Singletonexample s3 =Singletonexample.getinstance();
		System.out.println(s3.hashCode());
		
		
		
		
	}
	
	
	
	
	
	
}
