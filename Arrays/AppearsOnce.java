import java.util.HashSet;
import java.util.Hashtable;

public class AppearsOnce
{
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 1, 1};
        System.out.println(something(arr));
    }
    public static int something(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                duplicates.add(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!duplicates.contains(arr[i])) {
                return arr[i];
            }
        }

        return -1;
    }

}
