package com.collect;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExp {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("random");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
