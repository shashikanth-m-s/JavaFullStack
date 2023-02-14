package com.lab;

class DEF {
	public void print_DEF(){
		System.out.println("cooking");
		
	}
}
class QRS extends DEF{
	public void print_QRS() {
		System.out.println("emerging technology");
	}
}
class TUV extends QRS{
	public void print_TUV() {
		System.out.println("iot student");
	}
}

public class ExerciseTwentySix{

	public static void main(String[] args) {
		TUV f = new TUV();
		f.print_TUV();
		QRS z = new QRS();
		f.print_QRS();
	
		

	}
}


