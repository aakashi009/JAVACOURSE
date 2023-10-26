import java.util.Scanner;
public class AO3_Q01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num=sc.nextInt();
        System.out.println((((num+8)/3)%5)*5);
    }
}
