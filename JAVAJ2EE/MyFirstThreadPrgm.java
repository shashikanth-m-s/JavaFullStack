package com.threads;

class Myclass extends Thread{
	//override the the method from Thread class
	public void run() {
		System.out.println("Child Thread "+Thread.currentThread());
	}
}
public class MyFirstThreadPrgm {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());//Parent Thread
		Myclass sob=new Myclass();//first thread
		sob.setName("first");
		sob.start();
		Myclass sob1=new Myclass(); //second thread 
		sob1.setName("second");
		sob1.start();
		
		
	}

}



