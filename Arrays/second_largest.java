
class second_largest{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int seconds = second(arr);
        System.out.println(seconds);
    }
    public static int second(int[] arr) {
        int largest = arr[0];
        int second = arr[0];
        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }
        return second;
    }
}