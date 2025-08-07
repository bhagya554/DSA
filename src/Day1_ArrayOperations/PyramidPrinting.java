package Day1_ArrayOperations;

import java.util.Scanner;

public class PyramidPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pattern = pyramidPrinting(n);

        for (int i = 0; i < n; i++)
            System.out.println(pattern[i]);

    }
    // TODO: Implement this method
    //Note:- It is mandatory to return the array in the below function.
    // Printing the answer in console won't work
    /*
   {"* " ,"* * ","* * * ","* * * * " }
     */
    private static String[] pyramidPrinting(int n) {
        String[] res = new String[n];
        for(int i=0;i<n;i++){
            res[i]="";//res[2]
            for(int j=0;j<=i;j++){
                res[i]+="* ";//res[0] = "* * * * "
            }
        }
    return  res;
    }
}
