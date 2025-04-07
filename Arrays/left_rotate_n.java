import java.lang.reflect.Array;
import java.util.Arrays;

public class left_rotate_n {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,3,5};
        System.out.println(Arrays.toString(rorate_n(arr,2)));
    }
    public static int[] rorate_n(int[] arr,int n){
        int[] arr1 = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            arr1[i] = arr[(i+n+ arr.length)% arr.length];
        }
        return arr1;
    }
}
