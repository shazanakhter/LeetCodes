class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        int ans=0;
        int[] psum=prefixSum(n,nums,k);
        hm.put(0,1);
        for(int ep=0;ep<n;ep++){
            int diff=psum[ep]-k;
            ans=ans+hm.getOrDefault(diff,0);
            hm.put(psum[ep],hm.getOrDefault(psum[ep],0)+1);
        }
        return ans;
    }
    public int[] prefixSum(int n, int[] nums, int k){
        int[] preSum=new int[n];
        preSum[0]=nums[0];
        for(int i=1;i<n;i++){
            preSum[i]=preSum[i-1]+nums[i];
        }
        return preSum;
    }

}