
//Create a calculator  to perform addition, subtraction, multiplication and division.
import java.util.Scanner;
public class A04_Q05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUM1: ");
        double num1=sc.nextDouble();
        System.out.print("ENTER A OPERATION(+,_,*,%,/): ");
        char str= sc.next().charAt(0);
        System.out.print("ENTER NUM2: ");
        double num2=sc.nextDouble();
        switch(str) {
            case '+':
                System.out.println("sum of the numbers is "+(num1+num2));
                break;
            case '-':
                System.out.println("difference of the numbers is "+(num1-num2));
                break;
            case '*':
                System.out.println("product of the numbers is "+(num1*num2));
                break;
            case '/':
                System.out.println("division of the numbers is "+(num1/num2));
                break;
            case '%':
                System.out.println("remainder of the numbers is "+(num1%num2));
                break;
        }
        }
    }

