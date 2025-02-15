class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]<1||nums[i]>nums.length||i==nums[i]-1){
                i++;
                continue;
            }
            int index=nums[i]-1;
            if(nums[i]==nums[index]){
                i++;
                continue;
            }
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}