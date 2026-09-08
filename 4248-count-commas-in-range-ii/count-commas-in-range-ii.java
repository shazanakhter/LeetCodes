class Solution {
    public long countCommas(long n) {
        long p=1000;
        long res=0;
        while(p<=n){
            res=res+n-p+1;
            p=p*1000;
        }
        return res;
    }
}