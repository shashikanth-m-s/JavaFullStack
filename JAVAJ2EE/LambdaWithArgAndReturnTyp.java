package com.series;
@FunctionalInterface
interface Addition{
	int add(int a,int b);
}
@FunctionalInterface
interface Subraction{
	int sub(int a,int b);
}
@FunctionalInterface
interface Multiplication{
	int mul(int a,int b);
}
@FunctionalInterface
interface Division{
	int div (int a,int b);
}
public class LambdaWithArgAndReturnTyp {

	public static void main(String[] args) {
	     Addition aob=(a,b)->a+b;
	     System.out.println("sum="+aob.add(2, 6));
	     

	     Subraction sob=(a,b)->a-b;
	     System.out.println("diff="+sob.sub(8, 6));
	     

	     Multiplication mob=(a,b)->a*b;
	     System.out.println("product="+mob.mul(8, 5));
	     

	     Division dob=(a,b)->a/b;
	     System.out.println("div="+dob.div(88, 6));




	}

}
