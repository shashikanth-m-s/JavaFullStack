package com.threads;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("thread name="+Thread.currentThread() +"i="+i);
			
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread tob1=new MyThread();
		MyThread tob2=new MyThread();
		tob1.setName("first");
		tob2.setName("second");
		tob1.setPriority(2);
		tob2.setPriority(4);
		tob1.start();
		tob1.join();
		tob2.start();
		

	}

}
