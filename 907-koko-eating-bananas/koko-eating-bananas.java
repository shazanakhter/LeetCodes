class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;

        for(int pile:piles){
            high=Math.max(high,pile);
        }
       
        while(low<high){
            int totalTime=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<piles.length;i++){
                totalTime+=Math.ceil((double)piles[i]/mid);
            }

            if(totalTime<=h){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}