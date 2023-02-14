package com.threads;



class PrintTable{
	synchronized void multiplicationTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
}
class SynThreadClass1 extends Thread{
	
	PrintTable tob;
	public SynThreadClass1(PrintTable t) {
		tob=t;
	}

	public void run() {
		tob.multiplicationTable(5);
	}
	
}
class SynThreadClass2 extends Thread{
PrintTable tob;
	public SynThreadClass2(PrintTable t) {
		tob=t;
	}

	public void run() {
		tob.multiplicationTable(10);
	}
	
}
public class SynchronizationOp {

	public static void main(String[] args) throws InterruptedException {
		PrintTable t=new PrintTable();
		SynThreadClass1 t1=new SynThreadClass1(t);
		SynThreadClass2 t2=new SynThreadClass2(t);
		t1.start();
		t2.start();

	}

}



	
