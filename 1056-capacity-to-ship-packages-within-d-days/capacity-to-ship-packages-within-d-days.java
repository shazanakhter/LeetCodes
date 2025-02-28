class Solution {

    public int calculate(int[] weights, int m){
        int days=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>m){
                days++;
                sum=0;
            }
            sum+=weights[i];
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int lo=Integer.MIN_VALUE;
        int ho=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>lo){
                lo=weights[i];
            }
            ho=ho+weights[i];
        }
        int ans=0;
        while(lo<=ho){
            int m=lo+(ho-lo)/2;
            int reqdays=calculate(weights,m);
            if(reqdays<=days){
                ans=m;
                ho=m-1;
            }else{
                lo=m+1;
            }
        }
        return ans;
        
    }
}