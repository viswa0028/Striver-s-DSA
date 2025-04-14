import java.util.Hashtable;

public class stocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 9, 6, 4};
        stocks(prices);
    }
    public static void stocks(int[] arr){
        int profit = 0;
        int maxProfit = 0;
        int sellPrice = arr[0];
        int temp = 0;
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        for(int i =0;i<arr.length;i++){
            hashtable.put(arr[i],i);
        }
        int day = 0;
        for(int i = 1;i<arr.length;i++){
            profit = arr[i] - arr[0];
            temp = arr[i - 1] - arr[0];

            if(profit > maxProfit){
                maxProfit = profit;
                sellPrice = arr[i];
                day = i+1;
            }
        }

        if (maxProfit > 0) {
            System.out.println("Buy at: " + arr[0] + ", Sell at: " + sellPrice + ", day: " + day);
        } else {
            System.out.println("No profitable trade possible.");
        }
    }
}
