public class maxsumsubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,4,4};
        System.out.println(maxsum(arr));

    }
    public static int maxsum(int[] arr){
        int res = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > res) {
                res = sum;
            }
            if (sum < res) {
                sum = 0;
            }
        }

        return res;
    }
}
