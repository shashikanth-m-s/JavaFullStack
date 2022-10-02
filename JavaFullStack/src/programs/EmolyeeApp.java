package programs;

import java.util.Scanner;

class details{
	//instance variable :the varibales declared in the class
	private int age; //int 0
	private String name;//String null
	private float salary; //0.0
	
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter salary");
		salary=sc.nextFloat();
	}
	
	public void employeeDisplay() { //member function
		//int totalsalary; //local variable: the variable declared inside a method
		                  //local varibale does not have default values
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("salary="+salary);
		//System.out.println("total salary ="+totalsalary); compilation error
	}
}

public class EmolyeeApp {

	public static void main(String[] args) {
		
		System.out.println("main method");
		details employeeobject1=new details(); //Object creation
		employeeobject1.inputData();
		employeeobject1.employeeDisplay();
		details employeeobject2=new details(); //Object creation
		employeeobject2.inputData();
		employeeobject2.employeeDisplay();
		
	}

}
