//sum of number 1-2+3-4
import java.util.Scanner;
public class A05_q05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of terms: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum-=i;}
                else sum+=i;
        }
        System.out.println("sum of the series of n terms is "+sum);
    }
}
