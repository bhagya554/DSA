package Day1_ArrayOperations;

public class Array_RightRotation_ClockWise {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=45;
        a[1]=20;
        a[2]=7;
        a[3]=15;
        a[4]=40;
        int n=a.length;
       //{45,20,7,15,40} -- > 40,45,20,7,15
        int rotation=3;
        for(int i=0;i<rotation;i++){
            int temp=a[n-1];
            for(int j=n-1;j>=1;j--) {//1,2,3,4- n-1
                a[j] = a[j-1];// 1-45,2-20,3-7
            }
            a[0]= temp;
            System.out.println("After " + (i+1) + " right rotation");
            for(int j=0;j<a.length;j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();

        }




        System.out.println();

    }
}
