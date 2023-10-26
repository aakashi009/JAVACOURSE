//Write a program to calculate marks to grades . Follow the conversion rule as given below :
import java.util.Scanner;
public class A04_Q06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MARK TO CALCULATE GRADE: ");
        double n=sc.nextDouble();
        if(n>90){
            System.out.println("A+");}
            else if(n>80){
                System.out.println("A");}
                  else if(n>70){
                    System.out.println("B+");}
                      else if(n>60){
                        System.out.println("B");}
                          else if(n>50){
                            System.out.println("C");}
                              else if(n>40){
                                System.out.println("D");}
                                  else if(n>30){
                                    System.out.println("E");}
                                      else{
                                        System.out.println("F");}
        }
    }
