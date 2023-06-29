import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.

        Arrays.sort(intervals, (a,b) -> a.start - b.start);
        
        List<Interval> ans = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            // If the ans is empty then push the first element
            //                                       to get the ending interval of the current merging interval
            if(ans.isEmpty() || intervals[i].start > ans.get(ans.size()-1).finish){
                ans.add(new Interval(intervals[i].start,intervals[i].finish));
            }
            else{
                // max between current intervals finish and the new intervals finish
                int max = Math.max(ans.get(ans.size()-1).finish, intervals[i].finish);
                // storing the max interval ending in the current interval
                ans.get(ans.size()-1).finish = max;
            }
        }
        return ans;
       
    }
}
