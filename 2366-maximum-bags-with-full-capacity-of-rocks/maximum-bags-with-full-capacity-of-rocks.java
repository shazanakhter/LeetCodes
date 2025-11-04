class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int fullBags=0;
        for(int i=0;i<rocks.length;i++){
            if(capacity[i]-rocks[i]==0){
                fullBags++;
            }else{
                pq.offer(capacity[i]-rocks[i]);
            }
        }
        while(!pq.isEmpty()&&additionalRocks>0){
            int need=pq.poll();
            if(additionalRocks>=need){
                additionalRocks-=need;
                fullBags++;
            }else{
                break;
            }
        }
        return fullBags;
    }
}