import java.lang.reflect.Array;
import java.util.Arrays;

public class left_rotate {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,4};
        int[] arr1 = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            arr1[i] = arr[(i+ arr.length-1)% arr.length];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
