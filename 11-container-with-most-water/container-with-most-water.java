class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
       // int area=0;
        while(i<j){
            int area=(j-i)*(Math.min(height[i],height[j]));
            max=Math.max(max,area);
            if(height[i]<height[j]){
                
                i++;
            }else {
                j--;
            }
        }
        return max;
    }
}