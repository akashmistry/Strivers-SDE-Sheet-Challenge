class Solution {
    private void merge(int nums[],int low,int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); //temp array
        int left = low; // starting index of the left half array
        int right = mid+1; // starting index of the right half array

        // storing the elements in temp array in sorted manner
        while(left<=mid && right<=high){
            if(nums[left]<= nums[right]){
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[right++]);
            }

        }

        // if elements are left in the left half array
        // put them all in the temp array
        while(left<=mid){
            temp.add(nums[left++]);
        }
        // if elements are left in the right half array
        // put them all in the temp array
        while(right<=high){
            temp.add(nums[right++]);
        }

        // putting back all the temp array in the nums array
        for(int i=low;i<=high;i++){
            nums[i] = temp.get(i-low);
        }
    }
    private int countPairs(int nums[],int low,int mid,int high){
        int count=0;
        int right = mid+1; //to keep a pointer in the right half
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>2*(long)nums[right]) right++; //increment right till the condition fails and update the count
            count+=(right-(mid+1));
        }
        return count;
    }
    private int mergeSort(int nums[],int low,int high){
        int count=0;
        if(low>=high) return count; //after splitting, if a single elelent left return count=0
        int mid = (low+high)/2;

        count+= mergeSort(nums,low,mid); //for counting on left half and returning count
        count+= mergeSort(nums,mid+1,high); //for counting on right half and returning count
        count+= countPairs(nums,low,mid,high); //for counting num of pairs from left half and right half
        merge(nums,low,mid,high); //simple merge
        return count; //return the count
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}