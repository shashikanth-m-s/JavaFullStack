package com.threads;

class Synchronized{
	synchronized void show(String p) {
		
	try {
		System.out.println(p);
		Thread.sleep(1000);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
class MyThread1 implements Runnable{
	Thread c;
	String m;
	Synchronized r;
	MyThread1(Synchronized  w,String k){
		r=w;m=k;
		c=new Thread(this);
	}
	public void run() {
		r.show(m);
	}
}

public class ExerciseThirtySeven {

	public static void main(String[] args) throws InterruptedException {
		Synchronized d = new Synchronized();
		MyThread1 t1 = new MyThread1(d,"hello");
		MyThread1 t2 = new MyThread1(d,"JAVA");
		t1.c.start();
		t2.c.start();
		t1.c.join();
		t2.c.join();
		

	}

}
