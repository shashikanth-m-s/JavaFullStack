package programs;

class Parent{
	int age=10;
	public int s=20;
	private int m=30;
	protected int k=40;
	void showdata(){
	System.out.println("parent data");
	System.out.println("age= "+age);
	System.out.println("s= "+s);
	System.out.println("m= "+m);
	System.out.println("k= "+k);
	}
	
}
class childs extends Parent{
	void accessdata() {
		System.out.println("child  data");
		System.out.println("age= "+age);
		System.out.println("s= "+s);
		//System.out.println("m= "+m); private memeber cant accessible 
		System.out.println("k= "+k);
	}
}

public class AccesSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childs ch= new childs();
		ch.showdata();
		ch.accessdata();

	}

}
