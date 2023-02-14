package com.collect;

import java.util.ArrayList;

public class MyArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("second");
		System.out.println("actual arraylist:"+al);
		ArrayList<String>copy = (ArrayList<String>)al.clone();
		System.out.println("cloned arraylist:"+copy);

	}

}
