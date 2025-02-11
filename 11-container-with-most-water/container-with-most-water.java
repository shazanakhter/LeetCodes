class Solution {
    public int maxArea(int[] height) {
        int maxAmount=Integer.MIN_VALUE;
        int left=0,right=height.length-1;
        while(left<right){
            maxAmount=Math.max(maxAmount,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAmount;
    }
}