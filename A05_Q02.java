//COUNT NUMBER OF DIGITS IN THE GIVEN NUMBER
import java.util.Scanner;
public class A05_Q02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        int orig=n;
        int digit=0;
       while(n>0){
           digit+=1;
           n/=10;
       }
        System.out.println("number of digits in "+orig+ " is "+digit);
    }
}
