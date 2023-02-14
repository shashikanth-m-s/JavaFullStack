package com.threads;


class Bank{
	float amount;
	Bank(){
		amount=1000;
	}
	
	synchronized void deposit(float damount) {
		amount=amount+damount;
		System.out.println("Total Bank after deposit balance="+amount);
	    notify();
	}
	
	synchronized public void withdraw(float wamount) throws InterruptedException {
		if(wamount>amount) {
			System.out.println("Insufficient Balance");
			System.out.println("Withdraw is not possible");
			wait();
		}
		else {
			amount=amount-wamount;
			System.out.println("After withdraw Balance="+amount);
		}
	}
}

public class BankThreadOp{

	public static void main(String[] args) {
		Bank bob=new Bank();
	Thread t1=new Thread() {
		public void run() {
			try {
				bob.withdraw(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	t1.start();
	
	Thread t2=new Thread() {
		public void run() {
			bob.deposit(1000);
		}
	};
	t2.start();
	}

}

