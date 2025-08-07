package Day2_UsingPointer;

import java.util.Scanner;

public class ReverseString_UsingPointer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = reverseString(str);
        System.out.println(ans);
        sc.close();
    }

    private static String reverseString(String str) {
    char[] chArr=str.toCharArray();
    int p1=0;
    int p2=chArr.length-1;
    while(p1<p2){
        char temp=chArr[p1];
        chArr[p1]=chArr[p2];
        chArr[p2]=temp;
        p1++;
        p2--;
    }
return new String(chArr);
    }

}
