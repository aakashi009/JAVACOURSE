//given 2 numbers a and b.find a raise to the power b
import java.util.Scanner;
public class A05_q07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a: ");
        int a=sc.nextInt();
        int ans=1;
        System.out.print("enter b: ");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            ans*=a;
        }
        System.out.println("value of a raised to power b is "+ans);
    }
}
