package com.lab;

import java.util.Scanner;

public class ShowRoom {
	 String name;
	long mobilenumber;
	double cost;
	double discount;
	double amount;

	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter mobilenumber");
		mobilenumber=sc.nextLong();
		System.out.println("Enter the cost");
		cost=sc.nextDouble();
	}
		
    void calculate() {
    	if(cost<=10000) {
    		discount= cost*5/100;
    		amount=cost-discount;
    		}else if(cost>10000&&cost<=20000) {
    				discount=cost*10/100;
    				amount=cost-discount;
    			}else if(cost>=20000&&cost<=35000) {
    					discount=cost*15/100;
    					amount=cost-discount;
    				}else if(cost>35000) {
    						discount=cost*20/100;
    						amount=cost-discount;
    					}
    				}
    	void display() {
    		System.out.println("customer name is:"+name);
    		System.out.println("mobilenumber is:"+mobilenumber);
    		System.out.println("amount is:"+amount);
    		
    	}

	public static void main(String[] args) {
		ShowRoom ob=new ShowRoom();
		ob.input();
		ob.calculate();
		ob.display();
	}
		

	}


