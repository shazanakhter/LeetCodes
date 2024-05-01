class Solution {
    public int trap(int[] height) {
        int[] premax=new int[height.length];
        int[] sufmax=new int[height.length];
        premax[0]=height[0];
        sufmax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            if(premax[i-1]<height[i]){
                premax[i]=height[i];
            }else{
                premax[i]=premax[i-1];
            }
        }
        for(int i=height.length-2;i>=0;i--){
            if(sufmax[i+1]<height[i]){
                sufmax[i]=height[i];
            }else{
                sufmax[i]=sufmax[i+1];
            }
        }
        int count=0;
        for(int i=1;i<height.length-1;i++){
            int diff=Math.min(premax[i-1],sufmax[i+1]);
            if(diff-height[i]>0){
                count=count+diff-height[i];
            }
        }
        return count;
    }
}