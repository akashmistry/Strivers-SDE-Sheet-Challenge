import java.io.*;
import java.util.* ;

public class Solution{
     public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        int n = arr.length;
        Arrays.sort(arr);
         List<int[]> integerArrays = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i<=j && arr[i]+arr[j]==s)
                {
                   integerArrays.add(new int[]{arr[i], arr[j]});
 
                }
            }
        }
        return integerArrays;
    }
}
