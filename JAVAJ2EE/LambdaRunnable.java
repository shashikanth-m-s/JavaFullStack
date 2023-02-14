package com.series;

public class LambdaRunnable {

	public static void main(String[] args) {
		
		Runnable rob=()->{
			System.out.println("run method is called");
		};
		Thread t = new Thread(rob);
		t.start();

	}

}
