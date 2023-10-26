//FIND CUBE OF THE GIVEN NUMBER
import java.util.Scanner;
public class A01_QO4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        double a=sc.nextInt();
        System.out.println("CUBE OF THE NUMBER IS: "+a*a*a);
        double cube=Math.pow(a,3);
        System.out.println("CUBE OF THE NUMBER IS: "+cube);
    }
}
