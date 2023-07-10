class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count =0;
        int majElement =0;
        for(int i=0;i<n;i++){
            if(count==0){
                count =1;
                majElement = nums[i];
            }
            else if(majElement == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        // as majority element exists in the array
        // we do not check again on the array
        return majElement;
    }
}