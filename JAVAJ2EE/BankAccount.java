package com.app;

import java.util.Scanner;

class Bank {
	float amount;
	void deposit(float depositamount) {
		amount = amount+depositamount;
		System.out.println("Balance in bank after deposit"+amount);
	}
	void withdraw(float withdrawamount) {
		if(withdrawamount > amount) {
			System.out.println("SUfficient account balance");
			System.out.println("Available amount="+amount);
		}else {
			amount=amount-withdrawamount;
			System.out.println("available balance after withdrawal "+amount);
		}
	}
}
	public class BankAccount {
		public static void main(String[] args) {
			float damount,wamount;
		    Bank bob=new Bank();
			Scanner sc=new Scanner(System.in);
			while(true) {
				System.out.println("********menu********");
				System.out.println("1.Deposit");
				System.out.println("2.withdrawal");
				System.out.println("Enter your choice");
				 int choice=sc.nextInt();
				 switch(choice) {
				 case 1:System.out.println("Enter the amount to deposit");
				 damount=sc.nextFloat();
				 bob.deposit(damount);
				 
				 break;
				 case 2:System.out.println("Enter the amount to withdraw");
				 wamount=sc.nextFloat();
				 bob.withdraw(wamount);
				 break;
				 default:System.out.println("invalid");
				 }
				 System.out.println("Do you want to continue(y/n)");
				 char option=sc.next().charAt(0);
				 if(option=='n') {
					 break;
				  }
				
				}
			System.out.println("exit");
	}
		

	}


