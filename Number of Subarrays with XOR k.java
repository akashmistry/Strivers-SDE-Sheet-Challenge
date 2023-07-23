import java.util.*;
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int xor =0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);// initial value is 0,1
        for(int i=0;i<a.length;i++){
            // prefix xor of all the elements till i
            xor=xor^a[i];
            // if k exists in the prefix sum then x should be there in the prefix sum
            int x = xor^b;
            // checking if x contains in the prefix
            // if yes then update count with the total no. of subarrays
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            //if xor contains in the array then update the no. of subarrays or
            // initialize with 1
            if(map.containsKey(xor)){
                map.put(xor,map.get(xor)+1);
            }
            else{
                map.put(xor,1);
            }
        }
        return count;
    }
}