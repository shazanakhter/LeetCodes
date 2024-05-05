class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0;
        int sum2=0;
        int n=nums1.length;
        for(int i=0;i<nums1.length;i++){
            sum1=sum1+nums1[i];
        }
        for(int i=0;i<n;i++){
            sum2=sum2+nums2[i];
        }
        int ans=-(sum1-sum2);
        return ans/n;
    }
}