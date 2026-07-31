class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length-1;i++){
            int idx=i+1;
            while(idx<prices.length){
                if(prices[i]>=prices[idx]){
                    prices[i]=prices[i]-prices[idx];
                    break;
                }
                idx++;
            }
        }
        return prices;
    }
}