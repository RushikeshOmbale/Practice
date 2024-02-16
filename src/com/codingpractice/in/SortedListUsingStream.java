package com.codingpractice.in;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListUsingStream {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("rushikesh");
		list.add("aman");
		list.add("vishal");
		list.add("kapil");
		
		System.out.println(list);
		
		List<String> sortedarraylist=list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("the sorted arraylist is "+sortedarraylist);
		
		List<String> ConvertinIntouppercase =list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println("the uuppercase letters are " +ConvertinIntouppercase);
		
		
		System.out.println(ConvertinIntouppercase);
		
	}

}
