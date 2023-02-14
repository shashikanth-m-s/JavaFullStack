package com.series;

public class FunctionCheck {

	  public void check(String str, char ch) {
	    int count = 0;
	    for (int i = 0; i < str.length(); i++) {
	      char Char = str.charAt(i);
	      if (ch == Char) {
	        count++;
	      }
	    }
	    System.out.println("number of "+ch+ " present is = " + count);
	  }

	  public void check(String s1) {
	    s1 = s1.toLowerCase();
	    for (int i = 0; i < s1.length(); i++) {
	      char Char = s1.charAt(i);
	      if (Char == 'a' || Char == 'e' || Char == 'i' ||Char == 'o'
	          || Char == 'u') {
	        System.out.print(Char + " " );
	      }
	    }
	  }
	  
	    public static void main(String args[])
	  {
	    FunctionCheck ob = new FunctionCheck();
	    ob.check("overload",'o');
	    ob.check("overloaded");
	  }
	}




