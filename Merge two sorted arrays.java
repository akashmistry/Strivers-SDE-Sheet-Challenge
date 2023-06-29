public import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int ans[] = new int[m+n];
        int i=0,j=0;
        int count=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                ans[count++] = arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                ans[count++] = arr2[j++];
            }
        }
        while(i<m){
            ans[count++] = arr1[i++];
        }
        while(j<n){
            ans[count++] = arr2[j++];
        }
        return ans;
    }
}
 {
    
}
