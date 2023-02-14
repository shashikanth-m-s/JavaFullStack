package com.app;

public class NestedLoop {

	public static void main(String[] args) {
		System.out.println("Pattern 1");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j+"");
			}
			System.out.println();
		}
		System.out.println("Pattern 2");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i+"");
			}
			System.out.println();	

	}
		System.out.println("Pattern 3");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"");
			}
			System.out.println();

}
		System.out.println("Pattern 4");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
