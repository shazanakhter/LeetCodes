class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int min=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<n;right++){
            total=total-nums[right];
            while(total<x&&left<=right){
                total=total+nums[left];
                left+=1;
            }
            if(total==x){
                 min=Math.min(min,(n-right-1)+left);
            }
        }
        return min!=Integer.MAX_VALUE?min :-1;
    }
}