import java.lang.reflect.Array;
import java.util.Arrays;

public class sorted_or_not {
    public static void main(String[] args) {
        int[] arr = new int[]{1,25,4,3,5,9};
        boolean a = sorted(arr);
        System.out.println(a);
    }
    public static boolean sorted(int[] arr){
        int[] arr1 = Arrays.copyOf(arr,arr.length);
        arr1 = bubblesort(arr1);
        return Arrays.equals(arr,arr1);
    }
    public static int[] bubblesort(int[] arr){
        for(int i = 0;i< arr.length-1;i++){
            for(int m = 0;m<arr.length-i-1;m++){
                if (arr[m]>arr[m+1]){
                    int num = arr[m];
                    arr[m] =arr[m+1];
                    arr[m+1] = num;
                }
            }
        }
        return arr;
    }
}
