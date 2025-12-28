class Solution {
    public long maximumScore(int[] nums) {
        long[] preSum=new long[nums.length];
        preSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            preSum[i]=preSum[i-1]+nums[i];
        }
        long[] sufMin=new long[nums.length];
        sufMin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sufMin[i]=Math.min(sufMin[i+1],nums[i]);
        }

        long ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            long score=preSum[i]-sufMin[i+1];
            ans=Math.max(score,ans);
        }
        return ans;
    }
}