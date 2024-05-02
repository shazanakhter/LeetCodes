class Solution {
    public int findMaxK(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==0){
                    if(nums[i]>nums[j]&&max<nums[i]){
                         max=nums[i];
                    }else if(nums[i]<nums[j]&&max<nums[j]){
                        max=nums[j];
                    }
                   
                }
            }
        }
        if(max==Integer.MIN_VALUE){
            return -1;
        }
        return Math.abs(max);
    }
}