class Solution {

    public long countSmaller(long mid, int[] coins){
        long correctedCount=0;
        int n=coins.length;
        for(int expressions=1;expressions<=(1<<n)-1;expressions++){
            long lcm=0;
            long order=0;
            for(int i=0;i<n;i++){
                if((expressions&(1<<i))!=0){
                    order++;
                    if(lcm==0){
                        lcm=coins[i];
                    }else{
                        lcm=(lcm/gcd(lcm,coins[i]))*coins[i];
                    }
                }
            }

            if(order%2==0){
                correctedCount-=mid/lcm;
            }else{
                correctedCount+=mid/lcm;
            }
        }
        return correctedCount;
    }
    public long findKthSmallest(int[] coins, int k) {
        
        Arrays.sort(coins);
        long left=1;
        long right=(long)coins[0]*k;
        while(left<right){
            long mid=left+(right-left)/2;
            if(countSmaller(mid,coins)>=k){
                
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    public long gcd(long a, long b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
        
    }
}