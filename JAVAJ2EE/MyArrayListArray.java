package com.collect;

import java.util.ArrayList;

public class MyArrayListArray {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("first");
		a1.add("second");
		System.out.println("actual arrayList:"+a1);
		String[] strArr = new String[a1.size()];
		a1.toArray(strArr);
		System.out.println("created Array content:");
		for(String str:strArr) {
			System.out.println(str);
		}

	}

}
