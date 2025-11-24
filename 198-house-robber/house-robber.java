class Solution {
    public int rob(int[] nums) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,dp,nums.length-1);
    }
    public int helper(int[] nums, int[]dp, int i){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int a=helper(nums,dp,i-1);
        int b=helper(nums,dp,i-2)+nums[i];

        dp[i]=Math.max(a,b);
        return Math.max(a,b);
    }
}