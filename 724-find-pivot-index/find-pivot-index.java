class Solution {
int[] psum;
    public void prefixSum(int[] nums){
        psum=new int[nums.length];
        psum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            psum[i]=psum[i-1]+nums[i];
        }
    }
    public int pivotIndex(int[] nums) {
        prefixSum(nums);
        if(psum[nums.length-1]-psum[0]==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(psum[i-1]==psum[nums.length-1]-psum[i]){
                return i;
            }
        }
        if(psum[nums.length-2]==0){
            return nums.length-1;
        }
        return -1;
    }
}