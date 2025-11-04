class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>low){
                low=weights[i];
            }
            high+=weights[i];
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int reqDays= calculateDays(weights,mid);
            if(reqDays<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int calculateDays(int[] weights, int m){
        int sum=0;
        int day=1;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>m){
                sum=0;
                day++;
            }
            sum=sum+weights[i];
        }
        return day;
    }
}