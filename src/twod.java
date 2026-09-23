import static java.util.Collections.reverse;

public class twod {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,89,99};
        reverse(arr ,0,arr.length-1);
        for (int ele:arr){
            System.out.println(ele);
        }
        }
    private static void reverse(int[] arr, int lo, int hi) {
        if (hi<lo) return;
        else {
            int t=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=t;
            reverse(arr,lo+1,hi-1);
        }
    }
}
