package com.collect;

import java.util.ArrayList;

public class MyBasicArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList <String>();
		al.add("Java");
		al.add("html");
		System.out.println(al);
		System.out.println("element at index 1:"+al.get(1));
		System.out.println("does list contains java?"+al.contains("Java"));
		al.add(2,"play");
		System.out.println(al);
		System.out.println("Is arrayList empty?"+al.isEmpty());
		System.out.println("Index of html is"+al.indexOf("html"));
		System.out.println("size of arraylist:"+al.size());
		

	}

}
