//ASSIGN VALUE OF VARIBALE A AND B AS 55 AND 70 THEN CHECK IF:
//1.BOTH THE CONDITION A<50&&A<B ARE TRUE
//2.ATLEAST ONE OF THE CONDITION A<50 OR A<B IS TRUE
import java.util.Scanner;
public class A03_Q04 {
    public static void main(String[] args) {
        int a=55,b=70;
        System.out.println(a<50&&a<b);
        System.out.println(a<50||a<b);
    }
}
