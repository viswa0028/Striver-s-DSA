class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2,5,4,3};
        int largestNumber = largest(arr);
        System.out.println("The largest number is: " + largestNumber);
    }
    public static int largest(int[] arr) {
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
            }
        }
        return num;
    }
}
