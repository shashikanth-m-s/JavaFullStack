package com.series;

public class ChangeFunction {
	
	void joyString(String s,char ch1, char ch2) {

    s = s.replace(ch1,ch2);
    System.out.println(s);
}
void joyString(String s){
    int first = s.indexOf(' ');
    int last = s.lastIndexOf(' ');
    System.out.println("First index of space is: " + first);
    System.out.println("Last index of space is: " + last);
}
void joyString(String s1, String s2){
String s= s1.concat(" ");
s= s.concat(s2);
    //String s = s1 + " " + s2;
    System.out.println(s);
}


public static void main(String[] args)
{
ChangeFunction ob = new ChangeFunction();
ob.joyString("computer",'o','i');
ob.joyString("topicwise computer icse questions");
ob.joyString("computer","programming");
}
}





