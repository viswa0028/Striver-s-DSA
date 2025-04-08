public class maxConsective {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 1, 1, 1};
        System.out.println(consecutive(arr));
    }

    public static int consecutive(int[] arr) {
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 1;  
            }
        }

        return maxCount;
    }
}
