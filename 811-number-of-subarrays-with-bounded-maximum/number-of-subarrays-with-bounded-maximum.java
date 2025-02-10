class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count=0;
        int n=nums.length;
        int lgei=0;
        int prevvalid=0;
        for(int ei=0;ei<n;ei++){
            if(nums[ei]>right){
                //count=count+0;
                lgei=ei+1;
                prevvalid=0;
            }else if(nums[ei]>=left&&nums[ei]<=right){
                count=count+ei-lgei+1;
                prevvalid=ei-lgei+1;
            }else{
                count=count+prevvalid;
            }
        }
        return count;
    }
}