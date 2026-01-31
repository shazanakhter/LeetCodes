class Solution {
    public int countElements(int[] nums) {
        if(nums.length==1|| nums.length==2) return 0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minCount=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                minCount=1;
            }else if(min==nums[i]){
                minCount++;
            }else{
                continue;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                maxCount=1;
            }else if(max==nums[i]){
                maxCount++;
            }else{
                continue;
            }
        }
        if(nums.length==minCount&& nums.length==maxCount) return 0;
        return nums.length-minCount-maxCount;
    }
}