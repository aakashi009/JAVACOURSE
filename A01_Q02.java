//ASCII VALUE FINDER
import java.util.Scanner;
public class A01_Q02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ONE CHARACTER:");
   char a=sc.next().charAt(0);
   int num=a;
        System.out.println("ASCII VALUE OF "+a+" IS "+num);
        sc.close();
    }
}
