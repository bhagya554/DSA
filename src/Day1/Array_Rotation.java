package Day1;

import java.util.Scanner;

public class Array_Rotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element of an array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Left Rotated Arr");
        int rotatedArr[] = leftRotatedArray(arr);
        for(int x:rotatedArr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static int[] leftRotatedArray(int[] arr) {
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
}
