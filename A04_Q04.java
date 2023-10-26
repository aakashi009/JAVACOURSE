//Write a program to print positive number entered by the user, if user enters a negative number, it is skipped.
import java.util.Scanner;
public class A04_Q04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n=sc.nextInt();
        if(n<0) System.out.println("given integer is negative and skipped");
        else System.out.println("positive integer: "+n);
    }
}
