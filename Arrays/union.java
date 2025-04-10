import java.util.Arrays;
import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[] arr1 = new int[]{2,3,4,5};
        int[] arr3 = new int[arr1.length+arr.length];
        for(int i=0;i<arr.length;i++){
            arr3[i] = arr[i];
        }
        for(int j=0;j<arr1.length;j++){
            arr3[j+ arr.length] = arr1[j];
        }
//        removedupli(arr3);
        System.out.println(Arrays.toString(arr3));
        int k = removedupli(arr3);
        for(int i=0;i<k;i++){
            System.out.println(arr3[i] + " ");
        }
    }
   public static int removedupli(int[] arr){
       HashSet <Integer> set = new HashSet<>();
       for(int i=0;i< arr.length;i++){
           set.add(arr[i]);
       }
       int k = set.size();
       int j = 0;
       for(int i:set){
           arr[j++] = i;
       }
       return k;
   }

}
