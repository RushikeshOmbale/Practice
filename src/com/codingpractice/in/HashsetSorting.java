package com.codingpractice.in;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetSorting {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(24);
		s.add(145);
		s.add(1);
		s.add(324);
		s.add(45);
		
		System.out.println("before sorting"+s);
		
		Set<Integer> s1 =new TreeSet<Integer>(s);
		System.out.println(s1);
		
		
		
	}

}
