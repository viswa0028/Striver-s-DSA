import java.util.HashSet;

public class remove_dup {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,3,4,5};
        int l = removeduplicates(arr);
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeduplicates(int[] arr){
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
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
