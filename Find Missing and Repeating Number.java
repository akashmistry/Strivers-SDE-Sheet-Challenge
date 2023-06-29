import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    private static int x,y;
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        // to store all the xor from 1 to n
        int xor1;

        int set_bit_no;
        int i;
        x=0;y=0;

        xor1=arr.get(0);

        // xor of all array elements in xor1
        for(i =1;i<n;i++){
            xor1 = xor1 ^ arr.get(i);
        }
        
        // xor the previous xor1 result to xor with (1 to n)
        // xor1^(1 to n);
        for(i=1;i<=n;i++){
            xor1 = xor1^i;
        }

         /* Get the rightmost set bit in set_bit_no */
         set_bit_no = xor1 & ~(xor1 - 1);
        
        /* Now divide elements into two sets by comparing
        rightmost set bit of xor1 with the bit at the same
        position in each element. Also, get XORs of two
        sets. The two XORs are the output elements. The
        following two for loops serve the purpose */
            for (i = 0; i < n; i++) {
                if ((arr.get(i) & set_bit_no) != 0)
                    /* arr[i] belongs to first set */
                    x = x ^ arr.get(i);
    
                else
                    /* arr[i] belongs to second set*/
                    y = y ^ arr.get(i);
            }
            for (i = 1; i <= n; i++) {
                if ((i & set_bit_no) != 0)
                    /* i belongs to first set */
                    x = x ^ i;
    
                else
                    /* i belongs to second set*/
                    y = y ^ i;
            }
            // ans[0] for missing
            // ans[1] for repeating
            int ans[] = new int[2];
            for(i =0;i<n;i++){
                if(x==arr.get(i)){
                    // if x is the repeating then set to 1st index and return
                    ans[0]=y;
                    ans[1]=x;
                    return ans;
                }
              
            }
            // else let it be the same
            ans[0]=x;
            ans[1]=y;
            return ans;
            // at last do a linear check which amont x and y is missing or repeating 
    
            /* *x and *y hold the desired output elements */
    }
}