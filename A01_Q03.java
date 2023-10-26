//print area of rectangle
import java.util.Scanner;
public class A01_Q03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER LENGTH OF RECTANGLE:");
        int  l=sc.nextInt();
        System.out.print("ENTER BREADTH OF RECTANGLE:");
        int b=sc.nextInt();
        System.out.println("AREA OF RECTANGLE IS: "+l*b);
        System.out.println("PERIMETER OF RECTANGLE:"+2*(l+b));
    }
}
