package com.codingpractice.in;

public class RemoveduplicateCharacters {
	public static void main(String[] args) {
		String s ="ABCABCABC";
		String result="";
		
		for(int i=0;i<s.length();i++)
		{
			 String ch= "" +s.charAt(i);
			 
			 //System.out.println(ch);
			 if(result.contains(ch))
			 {
				 continue;
			 }
			 
			 result+=ch;
			
		}
		 System.out.println(result);
		
	}
	
	
	

}
