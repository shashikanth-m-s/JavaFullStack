package com.collect;

import java.util.ArrayList;
import java.util.List;

public class MyElementCheck {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("First");
		al.add("second");
		List<String>list = new ArrayList<String>();
		list.add("second");
		list.add("random");
		System.out.println("does ArrayList contains all list elements?:"+al.containsAll(list));
		list.add("one");
		System.out.println("\"does ArrayList contains all list elements?:"+al.containsAll(list));
		

	}

}
