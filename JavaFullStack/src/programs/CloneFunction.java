package programs;

public class CloneFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ss[]= {5,4,3,2,1};
		int s1[]=ss.clone();
		System.out.println(ss==s1);// diff mmry loc
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
			System.out.println();
			int mm[][]= {{1,2,3},{6,7,8}};
			int m1[][]=mm.clone();
			System.out.println(mm[0]==m1[0]);// true
			
			
		

	}

}
