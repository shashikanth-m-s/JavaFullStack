package programs;
import java.util.Scanner;
public class DecimalToBinary {
    public int display(int n){
        int sum,digit;
        sum=0;
        int base=1;
        while(n!=0){
            digit=n%2;
            n=n/2;
            sum=sum+digit*base;
            base=base*10;
        }
        System.out.println(""+sum);
        return sum;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DecimalToBinary dcb=new DecimalToBinary();
        dcb.display(n);
        sc.close();
    }
}