package com.edu;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	int fnum,snum,tnum;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		fnum=sc.nextInt();
		System.out.println("Enter sencond number");
		snum=sc.nextInt();
		System.out.println("Enter third number");
		tnum = sc.nextInt();
		}
	void checknum() {
		if(fnum>snum && fnum>tnum) {
			System.out.println("Largest of"+fnum+","+snum+"and "+tnum+" is"+fnum);
					
		}else if(fnum>fnum&&snum>tnum) {
			System.out.println("Largest of"+fnum+","+snum+"and "+tnum+" is "+snum);
		}
			else {
				System.out.println("Largets of"+fnum+","+snum+"and "+tnum+" is "+tnum);
			}
		}
			
		
	

	public static void main(String[] args) {
		LargestOfThreeNumbers ob = new LargestOfThreeNumbers();
		ob.inputData();
		ob.checknum();

	}

}
