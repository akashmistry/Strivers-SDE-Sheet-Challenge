import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr){
        //Write your code here
        int low=0, mid =0;
        int high = arr.length-1;
        // int temp;
        while(mid<=high){
            switch(arr[mid]){
                case 0:{
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    // because 1 stays in the middle
                    mid++;
                    break;
                }
                case 2:{
                    // mid wont increment because we have to again check if the mid element is 1 or 0
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
         
        }

    }
}