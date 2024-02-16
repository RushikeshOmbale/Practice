package com.codingpractice.in;

public class StaticKeywordExample {
	
	int x;
	static String name ="rushikesh";
	String address;
	
	
	public void setX(int x) {
		this.x = x;
	}
	public static void setName(String name) {
		StaticKeywordExample.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
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
		s.setAddress("thane");
		
		System.out.println(s.x);
		System.out.println(s.address);
		
		System.out.println(StaticKeywordExample.add());
		
		
		
		
		
		
		
	}
	

}
