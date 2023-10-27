//find reverse of the given number
import java.util.Scanner;
public class A05_Q04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //2345
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int digit=0;
        while(n>0){
            digit=((digit*10)+n%10);
            n/=10;
        }
        System.out.println("reverse of the number is "+digit);
    }
}
