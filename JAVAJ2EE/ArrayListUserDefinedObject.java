package com.collect;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int sid;
	String sname;
	float fees;
	public Student(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
	}
	 
		
}

public class ArrayListUserDefinedObject {
	
	public static void main(String[] args) {
		Student s1=new Student(1,"doll",7887f);
		Student s2=new Student(2,"goo",6677f);
		
		ArrayList<Student> sobj  = new ArrayList<Student>();
		sobj.add(s1);
		sobj.add(s2);
		System.out.println(sobj);
		
		Iterator<Student>sitor = sobj.iterator();
		System.out.println("Id\tname\tfees");
		
		while(sitor.hasNext()) {
			Student st1 = sitor.next();
			System.out.println(st1.sid+"\t"+st1.sname+"\t"+st1.fees);
		}
		
	}

}
