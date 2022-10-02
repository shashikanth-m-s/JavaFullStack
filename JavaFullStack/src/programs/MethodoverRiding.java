package programs;

class MethodOne{
	String color= "red";
	void run(){
		System.out.println("Bike not started");
	}
}

class MethodTwo extends MethodOne{
	String color="green";
	void run() {
		System.out.println("bike color= "+color);
		System.out.println("Bike running");
	}
	void horn() {
		System.out.println("bike color= "+super.color);
		System.out.println(" bike horned");
	}
	void stop() {
		super.run();// parent method runs
		horn();// horned method runs
	}
	
}

public class MethodoverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTwo mt=new MethodTwo();
		mt.stop(); // super
		mt.run(); // over ride
		//mt.horn();
		
	}

}
