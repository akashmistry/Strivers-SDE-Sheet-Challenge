import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []a, int k) {
		// Write your code here.
	    Map<Long, Integer> map = new HashMap<Long,Integer>();

        long sum = 0;
        int maxSubarrayLength = 0;

        for(int i=0;i<a.length;i++){
            //calculate prexix sum till i
            sum+=a[i];
            //if sum matches k then update maxSubarrayLength
            if(sum==k){
                maxSubarrayLength=i+1;
            }
            // calculate rem of remaining part if sum!=k
            // remaining sum sum-k
            long rem = sum-k;
            // calculate len and update maxSubarrayLength
            if(map.containsKey(rem)){
                maxSubarrayLength = Math.max(maxSubarrayLength, i-map.get(rem));
            }
            // if map doesnot contains the sum then add the sum and the index
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxSubarrayLength;
	}
}