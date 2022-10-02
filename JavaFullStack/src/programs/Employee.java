package programs;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		String Ename;
		int Eage;
		float Esalary;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Employee");
		Ename=sc.nextLine();
		System.out.println("Enter age Employee");
		Eage=sc.nextInt();
		System.out.println("Enter salary Employee");
		Esalary=sc.nextFloat();
		
		System.out.println("Employee Details");
		System.out.println( "name="+Ename);
		System.out.println("age="+Eage);
		System.out.println("salary="+Esalary);
		
		
		

	}

}
