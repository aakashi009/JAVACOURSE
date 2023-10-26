//Write a program to print absolute value of a number entered by the user.
import java.util.Scanner;
public class A04_Q02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int n=sc.nextInt();
        if(n<0) System.out.println("ABSOLUTE OF THE NUMBER IS "+(-n));
        else System.out.println("ABSOLUTE OF THE NUMBER IS "+(n));
    }
}
