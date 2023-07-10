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
		//if we are not sure if majority element exists so we iterate and check again
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(majElement == nums[i]){
                count1++;
            }
        }
        if(count1>(n/2)){
            return majElement;
        }
        return -1;
    }
}