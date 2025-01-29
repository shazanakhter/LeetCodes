class Solution {
    public int climbStairs(int n) {
       int[] dp=new int[n+1];
       Arrays.fill(dp,-1);
       return helper(n,dp); 
    }
    public int helper(int n, int[] dp){
        if(n==1||n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int a=helper(n-1,dp);
        int b=helper(n-2,dp);
        dp[n]=a+b;
        return a+b;
    }
}