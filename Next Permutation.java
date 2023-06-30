import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int n= permutation.size();
		ArrayList<Integer> ans = new ArrayList<>();
		ans = permutation;
		int breakPoint=-1;
		// to find the breakpoint in the given permutation
		// we will traverse from the back
		for(int i=n-2;i>=0;i--){
			if(permutation.get(i)<permutation.get(i+1)){
				// index i is the breakpoint
				breakPoint = i;
				break;
			}
		}
		// If breakPoint doesnot exits then reverse the array and return
		if(breakPoint ==-1){
			Collections.reverse(ans);
			return ans;
		}
		// finding the slightly greater than the breakpoint element in the right half
		// and swap with the breakpoint element
		for(int i=n-1;i>breakPoint;i--){
			if(permutation.get(i)>permutation.get(breakPoint)){
				Collections.swap(ans, i, breakPoint);
				break;
			}
		}
		// reverse the right half of the array i.e in sorted order
        Collections.reverse(ans.subList(breakPoint+1, n));
	
		return ans;
	}
}








