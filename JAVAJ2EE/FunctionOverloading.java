package com.function;


	class FunctionOverload{
		void display() {
			System.out.println("Display method with zero argument");
		}
		void display(int i) {
			System.out.println("Display method with one int argument "+i);
		}
		void display(int i, int j) {
			System.out.println("Display method with two int argument "+i+"  and "+j);
		}
		void display(int i, int j, int k) {
			System.out.println("Display method with three int argument "+i+","+j+" and "+k);
			
		}
	}

	public class FunctionOverloading {

		public static void main(String[] args) {
			
			FunctionOverload ob=new FunctionOverload();
			ob.display();
			ob.display(6);
			ob.display(5,8);
			ob.display(3, 6, 7);
		}
}
