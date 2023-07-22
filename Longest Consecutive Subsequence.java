class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;

        Set<Integer> set = new HashSet<>();

        int longest = 1;

        // to set all the array elements in the set
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        // to find the longest sequence
        for(int it: set){
            if(!set.contains(it-1)){//if it is a starting number
                int count = 1;
                int element = it;
                // if it-1 is there then iterate all the next consecutive elements and 
                // track using count variable
                while(set.contains(element+1)){ 
                    count+=1;
                    element+=1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;

    }
}