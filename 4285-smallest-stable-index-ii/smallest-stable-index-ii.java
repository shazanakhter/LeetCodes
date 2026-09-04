class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] preMax=new int[n];
        int[] suffMin=new int[n];

        preMax[0]=nums[0];

        for(int i=1;i<n;i++){
            preMax[i]=Math.max(nums[i],preMax[i-1]);
        }

        suffMin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffMin[i]=Math.min(nums[i],suffMin[i+1]);
        }

        for(int i=0;i<n;i++){
            int max=preMax[i];
            int min=suffMin[i];

            if(max-min<=k){
                return i;
            }
        }
        return -1;
    }
}