class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int sum=0;
        for(int curr=1;curr<prices.length;curr++){
            int prev=curr-1;
            if(prices[prev]<prices[curr]){
                sum+=prices[curr]-prices[prev];
            }
        }
        return sum;
    }
}