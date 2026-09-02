class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<time.length;i++){
            int rem=time[i]%60;
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        long count=0;
        for(int i=0;i<time.length;i++){
            int diff=(60-(time[i]%60))%60;
            count=count+hm.getOrDefault(diff,0);
            if(diff==(time[i]%60)){
                count--;
            }
            
        }
        return (int)(count/2);
    }
}