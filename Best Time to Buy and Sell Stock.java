import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int maxProfit =0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            // set the min price of among all
            minPrice = Math.min(minPrice, prices.get(i));
            // set max pofit among maxProfit and diff of min price and current price
            maxProfit = Math.max(maxProfit, prices.get(i)-minPrice);
        }
        return maxProfit;
    }
}