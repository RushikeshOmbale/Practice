package com.codingpractice.in;

public class StaticKeywordExample {
	
	int x;
	static String name ="rushikesh";
	String address;
	
	public StaticKeywordExample(int x,String Address)
	{
		this.x=x;
		this.address=Address;
	}
	public static String add()
	{
		System.out.println("we are in add method");
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticKeywordExample.name);
		StaticKeywordExample s = new StaticKeywordExample(10, "mumbai");
		
		System.out.println(s.x);
		System.out.println(s.address);
		
		System.out.println(StaticKeywordExample.add());
		
		
		
		
		
		
		
	}
	

}
