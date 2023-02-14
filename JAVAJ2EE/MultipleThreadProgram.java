package com.threads;


//Second way of creating a thread is by implementing Runnable interface
class Myclass1 implements Runnable{
	//override the the method from Thread class
	public void run() {
		System.out.println("Child Thread "+Thread.currentThread());
	}
}

public class MultipleThreadProgram {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());//Parent Thread
		
		Myclass1 sob=new Myclass1();//first thread
		Thread t=new Thread(sob);
      
		
		t.setName("first"); //change the Thread name
		t.start();
		Myclass1 sob1=new Myclass1(); //second thread 
	      Thread t1= new Thread(sob1);
		t1.start(); 
		//sob1.start(); Exception: IlligalThreadStateException
		}
}



