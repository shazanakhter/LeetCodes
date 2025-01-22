class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int start=2;
        int end=nums.length-3;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid]==nums[mid-1]){
                mid--;
            }
            if(mid%2==0){
                start=mid+2;
            }else{
                end=mid-1;
            }
        }
        return nums[start];
    }
}