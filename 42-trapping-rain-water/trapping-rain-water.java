class Solution {
    public int[] prefix(int[] height){
        int[] prefix=new int[height.length];
        prefix[0]=height[0];
        for(int i=1;i<height.length;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        return prefix;
    }
    public int[] suffix(int[] height){
        int n=height.length;
        int[] suffix=new int[height.length];
        suffix[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        return suffix;
    }
    public int trap(int[] height) {
        int[] pmax=prefix(height);
        int[] smax=suffix(height);
        int n=height.length;
        int amount=0;
        for(int i=1;i<n-1;i++){
            int lb=pmax[i-1];
            int rb=smax[i+1];
            int yb=Math.min(lb,rb);
            int contribution=yb-height[i];
            if(contribution>0){
                amount+=contribution;
            }
        }
        return amount;
    }
}