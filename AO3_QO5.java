//find the total number of bits needed to be flipped to convert x and y
// input 65 80
//output 2
//idea is to take xor of the given two integer .after calculating xor,the problem will reduce to counting set bits in the xor output using kernighan algorithm

import java.util.Scanner;
public class AO3_QO5{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int n = x ^ y;
        int count = 0;
        while (n != 0){
            n = n & (n - 1);
            count++;
        }
        System.out.print(count);
    }
}