//print first n natural number
import java.util.Scanner;
public class A05_Q01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
