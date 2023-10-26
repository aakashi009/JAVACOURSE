import java.util.Scanner;
public class A01_Q05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUM1: ");
        int num1=sc.nextInt();
        System.out.print("ENTER NUM2: ");
        int num2=sc.nextInt();
        //swap using third variable
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("NUM1 AFTER SWAP: "+num1);
        System.out.println("NUM2 AFTER SWAP: "+num2);
        //for inline code
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 after swap: "+num1);
        System.out.println("num2 after swap: "+num2);
    }
}
