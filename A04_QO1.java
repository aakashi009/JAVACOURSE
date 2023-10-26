//Write a program which takes the values of length and breadth from user and check if it is a square or NOT
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class A04_QO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        int l=sc.nextInt();
        System.out.print("enter breadth: ");
        int b=sc.nextInt();
        if(l==b) System.out.println("IT IS A SQUARE");
        else System.out.println("NOT A SQUARE");

    }
}