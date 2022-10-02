package programs;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		String s=ss.next();
		System.out.println(s.length());
		//
		String sk="Boss";
		int n=sk.length();
		char[] ms=new char[n];
		sk.getChars(0, 4, ms, 0);
		System.out.println(Arrays.toString(ms));
		
		System.out.println(s.toCharArray());
		
		System.out.println(sk.compareTo("Boss"));// compare to
		
		System.out.println(sk.compareToIgnoreCase("BOSS"));
		
		String eb=" ";// empty blank
		System.out.println(eb.isBlank());
		System.out.println(eb.isEmpty());
		
		System.out.println(sk.charAt(0));// char index
		
		System.out.println(s.startsWith("sms"));// strt with end with
		System.out.println(s.endsWith("king"));
		
		String x="  sss  ";// trim strip
		System.out.println(x.trim());
		System.out.println(s.strip());
		System.out.println(s.repeat(3));// repeat
		System.out.println(s.contentEquals(sk));
		System.out.println(s+sk);

	}

}
