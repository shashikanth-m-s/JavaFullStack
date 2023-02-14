package com.function;

 class Overload{
	void addition(int i,int j) {
		int x = i+j;
		System.out.println("addition of two integer numbers are"+x);
		}
	void addition(float i,float j) {
		float x = i+j;
		System.out.println("addition of two integer numbers are"+x);
		}
	void addition(double i,double j) {
		double x = i+j;
		System.out.println("addition of two integer numbers are"+x);
		}
	void addition(long i,long j) {
		long x = i+j;
		System.out.println("addition of two integer numbers are"+x);
		}
	void addition(byte i,byte j) {
		byte x =(byte)(i+j);
		System.out.println("addition of two integer numbers are"+x);
		}
	void addition(short i,short j) {
		short x =(short) (i+j);
		System.out.println("addition of two integer numbers are"+x);
		}
 }

	public class OverloadDataType {
		
	public static void main(String[] args) {
		Overload ob =new Overload();
		ob.addition(4, 5);
		ob.addition(8.9f, 9.8f);
		ob.addition(5.9, 7.9);
		ob.addition(569l, 456l);
		ob.addition((byte)2,(byte) 1);
		ob.addition((short)9,(short) 6);
		
	}
		

	}


