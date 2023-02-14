package com.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) {
		Stack<Integer> sop = new Stack<Integer>();
		sop.push(32);
		sop.push(45);
		sop.push(67);
		System.out.println(sop);
		System.out.println("stack operation : "+sop.pop());
		Iterator<Integer> iter=sop.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	

	}

}
