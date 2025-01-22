class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            long sq=(long)mid*mid;
            if(sq==x){
                ans=mid;
            }
            if(sq>x){
                end=mid-1;
            }else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}