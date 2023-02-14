package com.threads;



class PrintTable1{
	synchronized void multiplicationTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
}

public class SyncTwo{

	public static void main(String[] args) throws InterruptedException {
		PrintTable1 t=new PrintTable1();
		Thread t1=new Thread() {
			public void run() {
				t.multiplicationTable(4);
			}
		};
		t1.start();
		Thread t2=new Thread() {
			public void run() {
				t.multiplicationTable(2);
			}
		};
		t2.start();
		Thread t3=new Thread() {
			public void run() {
				t.multiplicationTable(5);
			}
		};
		t3.start();

	}
}



