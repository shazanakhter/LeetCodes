class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(nums[n-1]<0){
            return nums[n-1]*nums[n-2]*nums[n-3];
        }
        if(n==3){
            return nums[1]*nums[2]*nums[0];
        }
        int ans=nums[n-1];
        
        int prod1=nums[0]*nums[1];
        int prod2=nums[n-2]*nums[n-3];
        ans=ans*Math.max(prod1,prod2);
        return ans;
    }
}