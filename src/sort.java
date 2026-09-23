import java.util.Arrays;

public class sort {
    static void main() {

//b sort
        int [] arr = {2,56,87,1,4,8};
//        int n=arr.length;
//        for (int i=0 ; i<n ; i++){
//            for (int j=0 ; j<n-1-i ;j++){
//                if(arr[j]>arr[j+1]){
//                    int t=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=t;
//                }
//            }
//        }
//        for (int ele : arr){
//            System.out.println(ele);
//        }

//Selection Sort

//    for (int i=0 ; i<arr.length ; i++){
//        int mindex = i;
//        for (int j=i+1; j<arr.length ; j++){
//            if (arr[j]<arr[mindex]){
//                mindex = j;
//            }
//        }
//            int temp = arr[i];
//            arr[i]=arr[mindex];
//            arr[mindex] = temp;
//    }
//    for (int ele : arr){
//        System.out.println(ele);
//    }

// merg sort

        mergsort(arr);
        for (int ele : arr){
            System.out.println(ele+" ");
        }

    }

    private static void mergsort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        mergsort(a);
        mergsort(b);
        merg(a, b, arr);
    }

    private static void merg(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }
}
