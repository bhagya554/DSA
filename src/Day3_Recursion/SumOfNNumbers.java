package Day3_Recursion;

import java.util.Scanner;
//SC: O(n) - height of the tree TC:O(n) - No.of function calls
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int sum=sumOfNum(n);
        System.out.println("Sum of n natural No: " + sum);
    }

    private static int sumOfNum(int n) {
       if(n==1){
           return 1;
       }
       return sumOfNum(n-1) + n;//5+4+3+2+1
    }
}
