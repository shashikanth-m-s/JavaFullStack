package com.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIterator {

	public static void main(String[] args) {
		int num,n;
		ArrayList<Integer>iob=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to store in arraylist");
		 n=sc.nextInt();
		System.out.println("Enter "+n+" roll number");
		for(int i=0;i<n;i++) {
			num=sc.nextInt();
			iob.add(num);
		}
		
		//Display using object
		System.out.println(iob);
		
		//Display using enhanced for loop or for each
		System.out.println("List elements are (using for each loop");
		for(int i:iob) {
			System.out.println(i);
		}
		
		//Using Iterator
		System.out.println("Using iterator");
		Iterator<Integer>it=iob.iterator();
		while(it.hasNext()) { //returns true if elements are there in arraylist
		  System.out.println(it.next());	
		}
	}

}

