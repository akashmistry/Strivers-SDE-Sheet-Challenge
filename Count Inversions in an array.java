import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
     long temp[]=new long[n];
     return mergeSort(arr,temp,0,n-1);
    }

    private static long mergeSort(long[] arr, long[] temp, int left, int right) {
        // Modification 1: to keep an count of inversions
        long inversions = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            inversions += mergeSort(arr, temp, left, mid); //for left half
            inversions += mergeSort(arr, temp, mid + 1, right); //for right half
            inversions += merge(arr, temp, left, mid + 1, right); //for merging the two halves
        }
        return inversions;
    }
  private static long merge(long[] arr, long[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        long inversions = 0;
        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                //Modification 2: to count all the pairs from right left elements
                inversions += mid - i;
            }
        }
        // if the elements are left from the left half
        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }
        // if the elements are left from the right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        // putting all the temp elements to the arr
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        // Modification 3: to return the inversions
        return inversions;
    }

}