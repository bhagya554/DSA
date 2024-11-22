package Day1;

public class Array_LeftRotation_AntiClockwise {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=45;
        a[1]=20;
        a[2]=7;
        a[3]=15;
        a[4]=40;
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        int rotationCount=3;
        for(int j=0;j<rotationCount;j++){
            int temp=a[0];
            for(int i=0;i<n-1;i++){
                a[i]=a[i+1];
            }
            a[n-1]= temp;
            System.out.println();
            System.out.println("After "+ (j+1)+" anti clock wise Rotation");
            for(int i=0;i<a.length;i++){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

    }
}
