class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            result=result^nums[i];
        }
        return result;
    }
}