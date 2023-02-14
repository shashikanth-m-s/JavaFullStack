package com.lab;

public class OperatorsExperiment {

	public static void main(String[] args) {
		int num1,num2;
		num1=10;
		num2=20;

		
		//Arithmetic operators
		
		int output = num1+num2;
		System.out.println("addition is "+output);
		int output1 =num2-num1;
		System.out.println("difference is "+output1);
		int output2= num1*num2;
		System.out.println("multiplication is "+output2);
		int output3= num1/num2;
		System.out.println("division is "+output3);
		int output4=num1%num2;
		System.out.println("modulo division is"+output4);
		
		  //unary operators
		double number=10,resultNumber;
		boolean flag = true;
		System.out.println("+number="+ +number);
		System.out.println("-number="+ - number);
		System.out.println("number ="+ ++number);
		System.out.println("number="+ --number);
		System.out.println("!flag="+!flag);
		
		//relational operators
		if(num1>num2) {
			System.out.println("number1 is gretaer than number2");
			
		}
		if(num1<num2) {
			System.out.println("number1 is less than number2");
			
		}
		if(num1==num2) {
			System.out.println("number 1 is equal to number2");
		}
		
		  //logical operator
		int num3=20;
		boolean result;
		result=(num1>num2)||(num3>num1);
		System.out.println("logical operator is "+result);
		
		result =(num1>num2)&&(num3>num1);
		System.out.println("logi op is"+result);
		
		//ternary operator
		int febdays=29;
		String display;
		display=(febdays==28)?"not a leap year":"leap year";
			System.out.println("year is "+display);
			
			//bitwise operator
	
			int a= 50;
			int b=20;
			int c=0;
			c=a&b;
			System.out.println("a&b="+c);
			c=a|b;
			System.out.println("a|b="+c);
			c=a^b;
			System.out.println("a^b="+c);
			c=~a;
			System.out.println("~a"+c);
			
			//shift operator
			c=a>>2;
			System.out.println("a>>2 ="+c);
			c=a<<2;
			System.out.println("a<<2="+c);
			
			
			
			
		
;
		

	}

}
