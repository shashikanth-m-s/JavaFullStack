package com.lab;

class SubjectMarks {
	int science;
	int social;
	int maths;
	
}

public class MarksOfStudent {
	

	public static void main(String[] args) {
		SubjectMarks stu= new SubjectMarks();
		stu.science = 80;
		stu.social=90;
		stu.maths=78;
		
		SubjectMarks stu2= new SubjectMarks();
		stu2.science=89;
		stu2.social=67;
		stu2.maths=56;
		
		System.out.println("Marks of first student");
		System.out.println("science = "+stu.science);
		System.out.println("social = "+stu.social);
		System.out.println("maths = "+stu.maths);
		
		
		System.out.println("Marks of Second student");
		System.out.println("science ="+stu2.science);
		System.out.println("social ="+stu2.social);
		System.out.println("maths ="+stu2.maths);
		

	}

}
