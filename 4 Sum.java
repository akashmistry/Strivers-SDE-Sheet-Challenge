class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        // to store all the answers
        List<List<Integer>> ans = new ArrayList<>();
        //sort the array
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            // to avoid duplicate numbers
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<n;j++){
                // to avoid duplicate numbers
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int left = j+1;//left pointer
                int right = n-1;//right pointer

                while(left<right){
                    long sum = nums[i];
                    sum+=nums[j];
                    sum+=nums[left];
                    sum+=nums[right];

                    // check if sum equals the target
                    // if yes push it to ans array and update the pointers
                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left++]); //moving left one step ahead
                        temp.add(nums[right--]); // moving right one step back
                        ans.add(temp);//adding temp to ans


                        //checking for duplicates while traversing the pointers
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }
                    else if(sum<target){
                        //sum is lesser so we will update left
                        left++;
                    }
                    else{
                        //sum is greater than target so we update right
                        right--;
                    }
                }
            }
        }
        return ans;
        // TC: O(n^3)
        // SC: O(1)
    }
}