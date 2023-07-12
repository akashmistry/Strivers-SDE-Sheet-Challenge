class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int count1=0,count2=0,elem1=Integer.MIN_VALUE,elem2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            // to keep count for elem1 and check if elem1 is already present in elem2
            // because we want unique 2 majority elements
            if(count1==0 && elem2!=nums[i]){
                count1=1;
                elem1 = nums[i];
            }
            // to keep count for elem2 and check if elem2 is already present in elem1
            // because we want unique 2 majority elements
            else if(count2==0 && elem1!=nums[i]){
                count2=1;
                elem2=nums[i];
            }
            else if(elem1==nums[i]){
                count1++;
            }
            else if(elem2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        // check if elem1 and elem2 actually is valid or not
        int mini = (int)(n/3)+1;
        int cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
            if(elem1==nums[i]) cnt1++;
            if(elem2==nums[i]) cnt2++;
        }
        if(cnt1>=mini) ans.add(elem1);
        if(cnt2>=mini) ans.add(elem2);
        return ans;
    }
}