public class 2 Sum {
    
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // to store the two indexes
        int ans[] = new int[2];
        // to hash the required value int he hash map
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            //current value ex:2 and target = 6
            int value = nums[i];
            // req value will be 6-2 = 4
            int required = target-value;
            // if map contains the required value
            //put the hashed index and the current index
            if(mpp.containsKey(required)){
                ans[0]= mpp.get(required);//hashed index
                ans[1] = i;//current index
            }
            mpp.put(nums[i],i); //store the value and index in the map
        }
        return ans;
    }
}