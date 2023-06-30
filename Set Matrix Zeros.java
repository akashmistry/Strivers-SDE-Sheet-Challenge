import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length;
        int m = matrix[0].length;
        int col=1;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    // if we encounter the zero then
                    // we will mark the row to 0
                    matrix[i][0] = 0;
                    if(j==0){
                        // as the row and col overlap so here we take another col variable
                        // as the column is zero then mark the col variable
                        col=0;
                    }
                    else{
                        // if the col is not 0 then we will mark the col indexes
                        matrix[0][j]=0;
                    }
                }
            }
        }
        // traverse the matrix but without traversing the dummy arrays
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                // check if the row or col is 0 
                // if yes then mark the matrix of i and j to 0
                if(matrix[i][j]!=0){
                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        // now we will traver the dummy array in the matrix itself
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++) matrix[0][j]=0;
        }
        if(col==0){
            for(int i=0;i<n;i++) matrix[i][0]=0;
        }
    }

}