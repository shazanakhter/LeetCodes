class Solution {
    public long sumAndMultiply(int n) {
       long sum=0;
       long x=0;
       long count=1;
       while(n>0){
        int rem=n%10;
        sum+=rem;
        if(rem!=0){
            x=rem*count+x;
            count=count*10;
        }
        n=n/10;
       }
       return x*sum;
    }
}