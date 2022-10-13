package programs;
import java.lang.Math;
import java.util.Iterator;
import java.util.Scanner;

public class ArmstrongNumber {
	static boolean isArmstrong(int n) {
	int sum=0, last=0,digits=0;
	int temp=n;
	while(temp>0) {
		temp=temp/10;
		digits++;
	}
	temp=n;
	while(temp>0) {
		last=temp%10;
		sum+=(Math.pow(last, digits));
		temp=temp/10;
	}
	if(n==sum) 
		return true;
	else 
		return false;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(isArmstrong(num)) {
			System.out.println(+num+" is armstrong number");
		}else {
			System.out.println("not arms number");
		}
		for(int i=0;i<=num;i++) {
			if(isArmstrong(i)) {
				System.out.print(+i+" ");
			}
		}

	}

}
