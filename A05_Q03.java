//sum of digits in given number
import java.util.Scanner;
public class A05_Q03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int digit=0;
        while(n>0){
            digit+=n%10;
            n/=10;
        }
        System.out.println("sum of the digits is "+digit);
    }
}
