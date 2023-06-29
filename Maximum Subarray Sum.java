import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long sum = 0;
        long maxi = arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            // first check the sum goes negative or not
            // if sum is negative then sum resets to 0 
            if(sum<0){
                sum=0;
            }
            if(maxi<sum){
                maxi = sum;
            }
           
        }
		return maxi;
	}

}
