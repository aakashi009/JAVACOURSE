//calculating factorial
import java.util.Scanner;
public class A05_q06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int org=n;
        int fac=1;
        for(int i=1;i<=n;i++){
         fac*=i;
        }
        System.out.println("factorial of "+org+" is "+fac);
    }
}

