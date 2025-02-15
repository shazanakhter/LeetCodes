class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int middle=0;
        while(start<=end){
            middle=start+(end-start)/2;
            if(target<nums[middle]){
                end=middle-1;
            }else if(target==nums[middle]){
                return middle;
            }else{
                start=middle+1;
            }
        }
        return start;
        
    }
}