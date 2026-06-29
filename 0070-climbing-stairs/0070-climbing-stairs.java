class Solution {
    public int st(int n,int dp[]){
        if(n==1||n==2) return n;
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=st(n-1,dp)+st(n-2,dp);
        return dp[n];

    }
    public int climbStairs(int n) {

    int dp[]=new int[n+1];
        
  return st(n,dp);
    }
}