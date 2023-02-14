package com.inter;

public class TryWithMultipleCatchMain {

	public static void main(String[] args) {
		int a=10, b=2,c=0;
		int ar[]={5,7,8,1,2};

		try{
		      c=a/b;  //exception
		      ar[7]=34; //exception
		}catch(ArithmeticException e){
		    e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
