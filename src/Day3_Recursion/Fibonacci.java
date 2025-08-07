package Day3_Recursion;

import java.util.Scanner;
//SC: O(n) - height of the tree TC:O(n) - No.of function calls - 2^n
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nthFibonacci(n);
        System.out.println(ans);
    }

    private static int nthFibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
