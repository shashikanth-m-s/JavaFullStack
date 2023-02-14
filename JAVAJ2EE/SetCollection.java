package com.stack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		Set<Integer> sob = new HashSet<Integer>();
		sob.add(45);
		sob.add(78);
		sob.add(89);
		sob.add(90);
		System.out.println(sob);
		Iterator<Integer>sitor=sob.iterator();
		System.out.println("elements in set:");
		while(sitor.hasNext()) {
			System.out.println(sitor.next());
		}
		System.out.println("linkedhashset");
        Set<Integer>sob1 = new LinkedHashSet<Integer>();
        sob1.add(null);
		sob1.add(45);
		sob1.add(78);
		sob1.add(89);
		sob1.add(90);
		System.out.println(sob1);
		Iterator<Integer>iter=sob1.iterator();
		System.out.println("elements in set:");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("Treeset");
        Set<Integer>sob2= new TreeSet<Integer>();
        
		sob2.add(45);
		sob2.add(78);
		sob2.add(89);
		sob2.add(90);
		System.out.println(sob2);
		Iterator<Integer>itero=sob2.iterator();
		System.out.println("elements in set:");
		while(itero.hasNext()) {
			System.out.println(itero.next());
		}

		
		
	

	}

}

