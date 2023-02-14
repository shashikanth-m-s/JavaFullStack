package com.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesExp {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(23);
		a1.add(45);
		a1.add(67);
		a1.add(56);
		a1.add(23);
		System.out.println(a1);
		Iterator<Integer>iter=a1.iterator();
		System.out.println("elements in set:");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

		
		Set<Integer>sob = new LinkedHashSet<Integer>(a1);
		System.out.println(sob);

		Iterator<Integer>itera=sob.iterator();
		System.out.println("elements in set:");
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}

		
		//after removing elements of list to be sorted
		Set<Integer>sob1= new TreeSet<Integer>(a1);

		a1.add(23);
		a1.add(45);
		a1.add(67);
		a1.add(56);
		a1.add(23);
		System.out.println(sob1);

		Iterator<Integer>itero=sob1.iterator();
		System.out.println("elements in set:");
		while(itero.hasNext()) {
			System.out.println(itero.next());
		}



	}

}
