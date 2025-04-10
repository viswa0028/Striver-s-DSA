import java.util.HashMap;
import java.util.Hashtable;

public class majority{
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,1,2,2};

        System.out.println(major(arr));
    }
    public static int major(int[] arr) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        int n = arr.length;
        for (int a : arr) {
            hashtable.put(a, hashtable.getOrDefault(a, 0) + 1);
            if (hashtable.get(a) > n / 2) {
                return a;
            }
        }
        return -1;
    }
}