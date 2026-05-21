class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxSum=sum;
        int right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            sum=sum-cardPoints[i]+cardPoints[right];
            maxSum=Math.max(maxSum,sum);
            right--;
        }
        return maxSum;
    }
}