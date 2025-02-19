class Solution {
    public int divide(int dividend, int divisor) {
        long a=dividend;
        long b=divisor;
        int sign=1;
        if(a<0){
            sign=sign*-1;
        }
        if(b<0){
            sign=sign*-1;
        }
        a=Math.abs(a);
        b=Math.abs(b);
        long q=0;
        long temp=0;
        for(int i=31;i>=0;i--){
            if(temp+(b<<i)<=a){
                temp=temp+(b<<i);
                q=q+((long)1<<i);
            }
        }
        if(sign<0){
            q=-q;
        }else if(q>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(q<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)q;
       

    }
}