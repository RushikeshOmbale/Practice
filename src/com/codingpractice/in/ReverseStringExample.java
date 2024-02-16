package com.codingpractice.in;

public class ReverseStringExample {
	
	public static void main(String[] args) {
		String s ="rushikesh is great";
		String s1=s.replace(" ", "");
		String[] s2=s.split(" ");
		for(String arr:s2)
		{
			System.out.println("by using split "+arr);
		}
		System.out.println("by using replace "+s1);
		
		String rev="";
		for(int i =s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("the reverse of string is "+rev);
		
		if(s1.equals(rev))
		{
			System.out.println("the String is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
	

}
