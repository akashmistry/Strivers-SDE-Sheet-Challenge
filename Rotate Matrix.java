import java.util.*;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.ArrayList;


public class Solution {
    public static void rotateMatrix(ArrayList < ArrayList < Integer >> mat, int n, int m) { // Write your code here.     
        int t = 0, l = 0, b = n - 1, r = m - 1;
        while (t < b && l < r){// to iterate for all elements until it reaches center    

        
            for (int i = t; i < b; i++) // top to bottom  
                swap(mat, i, l, i + 1, l);

                
            for (int i = l; i < r; i++) // left to right          
                swap(mat, b, i, b, i + 1);

                
            for (int i = b; i > t; i--) // bottom to top          
                swap(mat, i, r, i - 1, r);

                
            for (int i = r; i > l + 1; i--) // right to left + 1    to avoid 1st element which was swapped earlier during top - bottom               
                swap(mat, t, i, t, i - 1);
            l++;
            t++;
            r--;
            b--; // to itarate for internal elements  
        }
      
    }

    static void swap(ArrayList < ArrayList < Integer >> mat, Integer i1, Integer j1, Integer i2, Integer j2) {
        Integer t = mat.get(i1).get(j1);
        mat.get(i1).set(j1, mat.get(i2).get(j2));
        mat.get(i2).set(j2, t);
        //wasn't sure if I should take int or Integer so I took Integer as variable;    
    }
}