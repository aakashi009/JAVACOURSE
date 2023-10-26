import java.util.Scanner;
public class A02_Q01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name,roll number,field of interest: ");
        String firstname=sc.next();
        String lastname=sc.next();
        int roll=sc.nextInt();
        String foi=sc.next();
        System.out.println("name: "+firstname+" "+lastname);
        System.out.println("roll number: "+roll);
        System.out.println("field of interest: "+foi);

    }
}
