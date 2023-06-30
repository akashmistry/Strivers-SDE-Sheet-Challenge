import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static Arra
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.

		ArrayList<ArrayList<Long>> triangle = new ArrayList<ArrayList<Long>>();
		
		for(int i=1;i<=n;i++){
			long ans =1;
			ArrayList<Long> triangleRow = new ArrayList<>();
			triangleRow.add(ans);

			for(int j=1;j<i;j++){
				ans = ans*(i-j);
				ans = ans/j;
				triangleRow.add(ans);
			}
			triangle.add(triangleRow);
		}

		return triangle;
		
	}
}
