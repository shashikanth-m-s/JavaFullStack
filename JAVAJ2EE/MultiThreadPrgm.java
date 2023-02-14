package com.threads;

public class MultiThreadPrgm {

	public static void main(String[] args) {
		
		MultiThread thread1 = new MultiThread("Thread1");
		thread1.start();
		
		MultiThread thread2= new MultiThread("Thread2");
		thread2.start();
		

	}

}
class MultiThread implements Runnable{
	Thread Cooking;
	private String IoT;
	MultiThread(String name){
		IoT = name;
	}

	public void run() {
		System.out.println("thread running"+IoT);
		for(int i = 0;i<4;i++) {
			System.out.println(i);
			System.out.println(IoT);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("thread is interrupted");
		}
	}
	public void start() {
		System.out.println("thread started");
		if(Cooking == null) {
			Cooking = new Thread(this,IoT);
			Cooking.start();
		}
		
	}
}