package Day2_UsingPointer;

import java.util.Scanner;

public class StringPalindrom_UsingPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean ans = stringPalindrome(str);
        if (ans) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }

    private static boolean stringPalindrome(String str) {
    char[] ch = str.toCharArray();
    int p1=0;
    int p2=ch.length-1;

    while(p1<p2){
        if(ch[p1] == ch[p2]){
            p1++;
            p2--;
        }
        else{
            return false;
        }
    }
    return true;
    }
}
