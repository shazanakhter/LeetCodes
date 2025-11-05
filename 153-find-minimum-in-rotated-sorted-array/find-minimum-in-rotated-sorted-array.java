class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=nums[end]){
                if(ans==-1||nums[mid]<nums[ans]){
                    ans=mid;
                }
                end=mid-1;
            }else{
                if(ans==-1|| nums[start]<nums[ans]){
                    ans=start;
                }
                start=mid+1;
            }
        }
        return nums[ans];
    }
}