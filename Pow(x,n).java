class Solution {
    public double myPow(double x, int n) {
        double ans =1.0;
        long nn = n;
        // if n is negative then make it positive
        if(nn<0) nn = nn*-1;

        while(nn>0){
            if(nn%2==1){
                ans = ans*x;
                nn = nn-1;
            }
            else{
                x = x*x;
                nn = nn/2;
            }
        }
        // if n is negative return 1/ans
        if(n<0) ans = (double)(1.0)/(double)(ans);
        return ans;
        // TC: O(logn)
    }
}