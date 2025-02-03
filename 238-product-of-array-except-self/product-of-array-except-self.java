class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int n=nums.length;
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        int suffix=1;
        int[] ans=new int[nums.length];
        for(int i=n-1;i>0;i--){
            ans[i]=prefix[i-1]*suffix;
            suffix=suffix*nums[i];
        }
        ans[0]=suffix;
        return ans;
    }
}