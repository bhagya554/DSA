package Day1_ArrayOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(scanner.next());
        }
        List<Integer> ans = extractNumbers(N, arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static List<Integer> extractNumbers(int n, List<String> arr) {
    //
        // {"abc","123","-1","1-3","45","xyz","-"}
        List<Integer> res = new ArrayList<>();
        for(String s:arr){
            boolean status=true;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if((c=='-') && (s.length()==1 || i!=0)){
                    status=false;
                    break;
                }
                else if(c<'0' || c>'9'){
                    status=false;
                    break;
                }
            }
            if(status){
                res.add(Integer.parseInt(s));
            }
        }
        return res;
    }
}
