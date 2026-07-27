class Solution {
    public int maxProduct(int[] nums) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>a){
                b=a;
                a=nums[i];
            }else if(nums[i]>b){
                b=nums[i];
            }
        }

        return (a-1)*(b-1);
    }
}