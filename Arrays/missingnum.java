import java.util.Arrays;

public class missingnum {
    public static void main(String[] args) {
        int[] arr=  new int[]{1,2,3,4,6,7};
        System.out.println(addnum(arr,7));
    }
    public static int addnum(int[] arr,int n){
        int[] arr1 = new int[n];
        int num = arr[0];
        int a = 0;
        for(int i =0;i< arr.length;i++) {
            if (num == arr[i]) {
                num++;

            } else {
                a = num;
            }
        }
        return a;
    }
}
