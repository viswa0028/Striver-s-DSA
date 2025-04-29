import java.util.Arrays;

public class maxsumsubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,4,4};
        System.out.println(maxsum(arr));

    }
    public static int maxsum(int[] arr){
        int res = 0;
        int sum = 0;
        int[] ar = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if (sum > res) {
                res = sum;
                ar[i] = arr[i];
            }
            if (sum < res) {
                sum = 0;
                for(int j=0;j<arr.length;j++){
                    ar[arr.length-j-1] =0;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
        return res;
    }
}
