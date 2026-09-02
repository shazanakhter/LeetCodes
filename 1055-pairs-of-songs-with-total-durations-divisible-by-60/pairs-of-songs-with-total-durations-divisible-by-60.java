class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        long[] freq=new long[60];
        long count=0;
        for(int t:time){
            int rem=t%60;
            int diff=(60-rem)%60;
            count+=freq[diff];
            freq[rem]++;
        }
        return (int)count;
    }
}