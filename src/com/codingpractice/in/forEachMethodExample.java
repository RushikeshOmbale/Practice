package com.codingpractice.in;

import java.util.ArrayList;
import java.util.List;

public class forEachMethodExample {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		list.add(103);
		list.add(121);
		
		System.out.println(list);
		list.forEach(n->System.out.println(n));
		list.forEach(n ->{if(n%2==0)
		{
			System.out.println("even numbers are"+n);
		}
		}
			
			
			);
	}

}
