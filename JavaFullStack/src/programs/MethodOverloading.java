package programs;

public class MethodOverloading {
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void sub(double a, double b) {
		System.out.println(a-b);
	}
	void add(int a,double b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ml=new MethodOverloading();
		ml.add(20, 10);
		ml.sub(67.25, 43.30);
		ml.add(20, 36.60, 70);// over loading
	}

}
