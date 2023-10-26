//Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit
//or Loss.
import java.util.Scanner;
public class A04_Q03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter cost price: ");
        int cp=sc.nextInt();
        System.out.print("enter selling price: ");
        int sp=sc.nextInt();
        if(cp>sp) System.out.println("loss is: "+(cp-sp));
        else System.out.println("profit is: "+(sp-cp));
    }
}
