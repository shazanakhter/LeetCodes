class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=Math.abs(nums[i]);
            }
        }
        Arrays.sort(nums);
        long ans=0;
        int start=0;
        int end=nums.length-1;
        while(start<end){
            ans+=(long)nums[end]*nums[end]-(long)nums[start]*nums[start];
            start++;
            end--;
        }
        if(start==end){
            //start++;
            ans+=(long)nums[start]*nums[start];
        }
        return ans;
    }
}