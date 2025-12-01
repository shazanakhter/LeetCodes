class Solution {
    public int countElements(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<n;i++){
            int greater=n-helper(nums, nums[i]);
            if(greater>=k){
                ans++;
            }
        }
        return ans;
    }

    public int helper(int[] nums, int target){
        int low=0;
        int high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}