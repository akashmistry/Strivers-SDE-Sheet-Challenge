import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        if(mat.size()==0) return false;
        
        int n = mat.size();
        int m = mat.get(0).size();
        int low =0;
        int high = (n*m)-1;
        

        while(low<=high){
            int mid = (low+(high-low)/2);
            //did [mid/m][mid%m] to get the mid index of the imaginary 0 to 1 index
            if(mat.get(mid/m).get(mid%m)==target) return true;
            
            if(mat.get(mid/m).get(mid%m)<target) low = mid+1;
            else high = mid-1;
        }
        return false;
        
        
    }
}
