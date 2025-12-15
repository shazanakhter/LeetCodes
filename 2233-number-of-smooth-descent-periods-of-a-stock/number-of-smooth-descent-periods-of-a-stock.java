class Solution {
    public long getDescentPeriods(int[] prices) {
        long streak=1;
        long ans=1;
        for(int i=1;i<prices.length;i++){
            if(prices[i]==prices[i-1]-1){
                streak++;
            }else{
                streak=1;
            }
            ans+=streak;
        }
        return ans;
    }
}