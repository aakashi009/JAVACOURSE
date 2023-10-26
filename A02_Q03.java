import java.util.Scanner;
public class A02_Q03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER MARK OF SUBJECT 1: ");
        double num1=sc.nextDouble();
        System.out.print("ENTER MARK OF SUBJECT 2: ");
        double num2=sc.nextDouble();
        System.out.print("ENTER MARK OF SUBJECT 3: ");
        double num3=sc.nextDouble();
        double per= ((num1+num2+num3)/3.0);
        System.out.println("percentage is "+per);
            }
}
