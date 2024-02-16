package com.codingpractice.in;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharacterOfStrinExample {

	public static void main(String[] args) {
		String s = "aaabbbccc";
		HashMap<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch);

			if (m.containsKey(ch)) {

				int count = m.get(ch);
				m.put(ch, count + 1);

			}
			else
			{
				m.put(ch, 1);
			}
			
		}
		System.out.println(m);
		for(Map.Entry<Character, Integer>k:m.entrySet())
		{
			if(k.getKey()>1)
			System.out.println(k.getKey()+":" +" "+k.getValue());
		}

	}
	

}
