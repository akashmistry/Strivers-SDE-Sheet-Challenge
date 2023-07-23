class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0, maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        while(right<n){
            //if the map contains the repeating char then
            // jump left to that repeating char
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1,left);
            }
            //if doesnot exist simply put it in map with its index
            map.put(s.charAt(right),right);
            //updating the maxlen
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}