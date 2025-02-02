class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        int leftsum=0;
        for(int i:nums){
            totalsum+=i;
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum==totalsum-leftsum-nums[i]){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}