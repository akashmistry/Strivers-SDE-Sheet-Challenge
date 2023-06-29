import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        // Initialize the fast and slow pointer to the starting element of the array
        int slow = arr.get(0);
        int fast = arr.get(0);
        // we are using do while because already slow and fast are in same position from starting
        // and do while atleast runs a loop once
        do{
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        }while(slow!=fast);
        // here the fast and slow collids
        // we will take the fast ponter to the starting index
        fast = arr.get(0);

        // to find the colliding point
        while(slow!=fast){
            // move fast and slow by one point
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        // return the slow variable
        return slow;

    }
}
