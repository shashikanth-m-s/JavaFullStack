package programs;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str= new StringBuffer();// sbuffer
		str.append("hello ");
		System.out.println(str);
		str.insert(6, "morning king ");//insert
		System.out.println(str);
		System.out.println(str.reverse());//reverse
		System.out.println(str.capacity());
		str.replace(0, 4, "good");
		System.out.println(str);
	}

}
