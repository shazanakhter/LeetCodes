class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            result[i]=nums[((i+nums[i])%n+n)%n];
        }
        return result;
    }
}