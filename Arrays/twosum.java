public class twosum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(twosum(arr,10));
    }
    public static boolean twosum(int[] arr,int target){
        int temp =0;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                temp = i+j;
                if(temp == target){
                    return true;
                }
                else {
                    temp=0;
                }

            }
        }
        return false;
    }
}
