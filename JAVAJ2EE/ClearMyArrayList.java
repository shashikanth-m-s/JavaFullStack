package com.collect;

import java.util.ArrayList;

public class ClearMyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String>al = new ArrayList<String>();
		al.add("First");
		al.add("second");
		System.out.println("actual arraylist:"+al);
		al.clear();
		System.out.println("After clear ArrayList:"+al);

	}

}
