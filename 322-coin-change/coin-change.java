class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp= new int[amount+1];
        Arrays.fill(dp,-2);
        int ans= helper(coins,amount,dp);
        return ans;
    }

    public int helper (int[]coins, int amount, int[] dp){
        if(amount==0) return 0;
        if(amount<0) return -1;
        if(dp[amount]!=-2) return dp[amount];
        int min=Integer.MAX_VALUE;
        for(int coin: coins){
            int res= helper(coins,amount-coin,dp);
            if(res!=-1){
                min=Math.min(min,res+1);
            }
        }
        dp[amount]= (min==Integer.MAX_VALUE)? -1:min;
        return (min==Integer.MAX_VALUE)? -1:min;
    }
}