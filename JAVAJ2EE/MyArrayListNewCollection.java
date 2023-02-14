package com.collect;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListNewCollection {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("random");
		System.out.println("actual arraylist:"+al);
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		al.addAll(list);
		System.out.println("after copy:"+al);

	}

}
