package com.collect;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
	    
		ArrayList<Integer> lob = new ArrayList<>();
		lob.add(34);
		lob.add( 67);
		
		System.out.println(lob);
		for(int i:lob) {
			System.out.println(i);
		}
		
		ArrayList<Float> fob = new ArrayList<Float>();
		fob.add( 6.7f);
		fob.add(6.9f);
		
		System.out.println(fob);
		for(Float i:fob) {
			System.out.println(i);
		}
		
		ArrayList<String> sob = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of students");
		int n = sc.nextInt();
		String name;
		System.out.println("names");
		for(int i=0;i<n;i++) {
			name=sc.next();
			sob.add(name);
		}
		
		ArrayList<Double> dob =new ArrayList<Double>();
		dob.add( (double) 1112);
		dob.add(( double)56778);
		
		System.out.println(dob);
		for(Double i:dob) {
			System.out.println(i);
		}
		
		
		
 
	}

}

