class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=helper(n,dp);
        return ans;
    }
    public int helper(int n, int[] dp){
        if(n==0||n==1){
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