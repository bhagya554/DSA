package Day1_ArrayOperations;

public class Array_ValuesSquare {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=45;
        a[1]=20;
        a[2]=7;
        a[3]=15;
        a[4]=40;
        for(int i=0;i<a.length;i++){
            a[i] = a[i]*a[i];//SC: i(auxillary space): o(1), TC: 2*n - 2 OPERATIONS(* AND =): o(n)
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

    }

}
