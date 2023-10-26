import java.util.Scanner;
public class A02_QO4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER OF TEST CASE:");
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            System.out.print("enter num1 :");
            int a=sc.nextInt();
            System.out.print("enter num2 :");
            int b=sc.nextInt();
            System.out.println("sum is:"+(a+b));

        }
    }
}
