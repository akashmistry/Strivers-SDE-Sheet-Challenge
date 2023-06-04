class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int col0 = 1; //so the overlaping hashed array in the matrix dont collide

        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    // mark the ith row
                    matrix[i][0]=0;
                    // mark the jth col
                    // if condition to mark the col0 variable
                    if(j!=0){
                        // 
                        matrix[0][j]=0;
                    }
                    else{
                        // mark the outer overlap variable
                        col0=0;
                    }
                }
            }
        }

        // traverse the array except the hashed row and col
        // mark all the traversed array zero except the hashed row and col
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0] == 0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        // mark zeros to the on the hashed array itself
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++) matrix[0][j] = 0;
        }

        if(col0==0){
            for(int i=0;i<n;i++) matrix[i][0]=0;
        }

    }
}