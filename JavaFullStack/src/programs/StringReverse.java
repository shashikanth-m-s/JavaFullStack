package programs;

import java.util.Scanner;

class ReverseFunction{
	 
	void display(String s) {
		int c=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') 
			continue;
			System.out.println(s.charAt(i));
		}
	}
	
	
}

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		ReverseFunction rs= new ReverseFunction();
		rs.display(s);

	}

}
